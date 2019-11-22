/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;
public class Bean {
    private int marks;
    private String result;
    public Bean()
    {
        marks=0;
        result="na";
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
        onMarksChnage();
    }
    private void onMarksChnage()
    {
        if(marks>35)
            result="pass";
        else
            result="fail";
    }
    public String getResult()
    {
        this.result=result;
        return result;
    }
}
