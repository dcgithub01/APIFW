package com.testing.Trigger;

import java.io.IOException;

import com.testing.TestScripts.TC10_PutRequestEmployee;
import com.testing.TestScripts.TC11_DeleteEmployeeRecord;
import com.testing.TestScripts.TC1_PostRequest;
import com.testing.TestScripts.TC2_GetRequest;
import com.testing.TestScripts.TC3_GetRequestAllData;
import com.testing.TestScripts.TC4_PutRequest;
import com.testing.TestScripts.TC5_DeleteRequest;
import com.testing.TestScripts.TC7_PostRequestEmployee;
import com.testing.TestScripts.TC8_GetRequestEmployee;
import com.testing.TestScripts.TC9_GetSingleEmployeeDetails;

public class Trigger {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*TC1_PostRequest postTheRequest = new TC1_PostRequest();
postTheRequest.testCase1();
TC2_GetRequest getTheRequest = new TC2_GetRequest();
getTheRequest.testCase2(); 
//TC3_GetRequestAllData getAllData= new TC3_GetRequestAllData();
//getAllData.testCase3();
TC4_PutRequest putRequestSend = new TC4_PutRequest();
putRequestSend.putRequest();
TC5_DeleteRequest deleteRecord = new TC5_DeleteRequest();
deleteRecord.deleteRecordRequest();*/
TC7_PostRequestEmployee postRequestEmployee = new TC7_PostRequestEmployee();
postRequestEmployee.testCase7();
	//	TC8_GetRequestEmployee getRequestAll = new TC8_GetRequestEmployee();
		//getRequestAll.getRequest();
		TC9_GetSingleEmployeeDetails getSingleRecord = new TC9_GetSingleEmployeeDetails();
		getSingleRecord.getSingleRecordDetails();
		TC10_PutRequestEmployee put = new TC10_PutRequestEmployee();
		put.putRequest();
		TC11_DeleteEmployeeRecord delete = new TC11_DeleteEmployeeRecord();
		delete.deleteRecord();
	}

}
