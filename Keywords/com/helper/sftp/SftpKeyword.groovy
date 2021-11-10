package com.helper.sftp

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.function.Function

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SftpKeyword {

	@Keyword
	public void sftpDownloadUpload(String localFile, String remoteDir, String remoteFile, String updateContent){
		SftpConfiguration configuration = new SftpConfiguration().setAddress(GlobalVariable.sftplocation).setUsername(GlobalVariable.sftpusername).setPassword(GlobalVariable.sftppassword);
		SftpImpl sftpImpl = new SftpImpl(configuration);
		SftpUploadDownloadImpl sftpUploadDownloadImpl = new SftpUploadDownloadImpl(sftpImpl);
		sftpUploadDownloadImpl.downloadModifyAndUploadFile(localFile, remoteDir, remoteFile, new Function<File, File>() {

					@Override
					public File apply(File t) {
						try {

							Files.write(Paths.get(t.getAbsolutePath()), updateContent.getBytes(), StandardOpenOption.APPEND);
							return t;
						} catch (Exception e) {
							// Log the error using logger
							throw new RuntimeException(e.getMessage());
						}
					}
				});
	}
}
