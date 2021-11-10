package com.helper.sftp

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.commons.vfs2.FileObject
import org.apache.commons.vfs2.Selectors
import org.apache.commons.vfs2.impl.StandardFileSystemManager


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SftpImpl {

	private SftpConfiguration configuration;

	public SftpImpl(SftpConfiguration configuration){
		this.configuration = configuration;
	}


	public File uploadFile(String localFile, String remoteDir, String remoteFile){
		File fileToUpload = new File(localFile);

		try {
			StandardFileSystemManager manager = new StandardFileSystemManager();
			manager.init();
			FileObject localFiletoUpload = manager.resolveFile(fileToUpload.getAbsolutePath());
			FileObject remoteFiletoUpload = manager.resolveFile(configuration.build() + remoteDir + "/" + remoteFile);
			remoteFiletoUpload.copyFrom(localFiletoUpload, Selectors.SELECT_SELF);
			manager.close();
		} catch (Exception e) {
			// Log the exception using logger
			throw new RuntimeException(e.getMessage())
		}

		return fileToUpload
	}

	public File downloadFile(String localFile, String remoteDir, String remoteFile){
		File fileToDownlaod = new File(localFile);

		try {
			StandardFileSystemManager manager = new StandardFileSystemManager();
			manager.init();
			FileObject localFiletoDownlaod = manager.resolveFile(fileToDownlaod.getAbsolutePath());
			FileObject remoteFiletoDownlaod = manager.resolveFile(configuration.build() + remoteDir + "/" + remoteFile);
			localFiletoDownlaod.copyFrom(remoteFiletoDownlaod, Selectors.SELECT_SELF);
			manager.close();
		} catch (Exception e) {
			// Log the exception using logger
			KeywordUtil.markError(e.stackTrace)
			throw new RuntimeException(e.getMessage());
		}

		return fileToDownlaod;
	}
}


