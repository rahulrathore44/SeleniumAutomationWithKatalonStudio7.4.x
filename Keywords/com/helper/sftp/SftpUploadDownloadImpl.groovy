package com.helper.sftp

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class SftpUploadDownloadImpl {

	private SftpImpl sftpimpl;

	public SftpUploadDownloadImpl(SftpImpl sftpimpl){
		this.sftpimpl = sftpimpl;
	}


	public void downloadModifyAndUploadFile(String localFile, String remoteDir, String remoteFile, Function<File, File> updateContent){
		File downloadedFile = sftpimpl.downloadFile(localFile, remoteDir, remoteFile);
		File uploadFile = updateContent.apply(downloadedFile);
		sftpimpl.uploadFile(uploadFile.getAbsolutePath(), remoteDir, uploadFile.getName());
	}
}
