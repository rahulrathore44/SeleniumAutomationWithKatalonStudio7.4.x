package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object ApplicationUrl
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object DelayTime
     
    /**
     * <p>Profile default : Explicit Wait Timeout
Profile Production : Explicit Wait Timeout
Profile Stage : Explicit Wait Timeout</p>
     */
    public static Object TimeOut
     
    /**
     * <p></p>
     */
    public static Object Path
     
    /**
     * <p></p>
     */
    public static Object Name
     
    /**
     * <p></p>
     */
    public static Object NewProperty
     
    /**
     * <p></p>
     */
    public static Object datafile
     
    /**
     * <p></p>
     */
    public static Object sftplocation
     
    /**
     * <p></p>
     */
    public static Object sftpusername
     
    /**
     * <p></p>
     */
    public static Object sftppassword
     
    /**
     * <p></p>
     */
    public static Object DataList
     
    /**
     * <p></p>
     */
    public static Object StageTimeOut
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            ApplicationUrl = selectedVariables['ApplicationUrl']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            DelayTime = selectedVariables['DelayTime']
            TimeOut = selectedVariables['TimeOut']
            Path = selectedVariables['Path']
            Name = selectedVariables['Name']
            NewProperty = selectedVariables['NewProperty']
            datafile = selectedVariables['datafile']
            sftplocation = selectedVariables['sftplocation']
            sftpusername = selectedVariables['sftpusername']
            sftppassword = selectedVariables['sftppassword']
            DataList = selectedVariables['DataList']
            StageTimeOut = selectedVariables['StageTimeOut']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
