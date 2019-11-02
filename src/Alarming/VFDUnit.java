/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alarming;

/**
 *
 * @author retsu
 */
public class VFDUnit implements IVFDUnit {

    String unitName;
    String testCode;
    String alarmCode;

    public VFDUnit(String unitName, String testCode, String alarmCode) {
        this.unitName = unitName;
        this.testCode = testCode;
        this.alarmCode = alarmCode;
    }


    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    
    
    @Override
    public ResponseCode notify(String CCIR_CODE)
    {
    	if(CCIR_CODE.equals(this.alarmCode) == true)
    		return ResponseCode.ALARM_OK;
    	else if(CCIR_CODE.equals(this.testCode) == true)
         	return ResponseCode.TEST_OK;
    	else
    		return ResponseCode.ERROR;
    }
    
}
