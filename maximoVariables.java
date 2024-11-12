/***import psdi.mbo.MboRemote;
import psdi.mbo.MboSetRemote;
import psdi.server.MXServer;
import psdi.util.MXException;
 ***/

import java.rmi.RemoteException;
import java.util.Date;

import static java.lang.Float.*;

public class maximoVariables {
    public static void main(String[] args) {

        int intValue=10;
        double doubleValue=0.20;
        float floatValue=0.30f;
        Double doubleValue1=Double.valueOf(0.20);
        float floatValue1= Float.valueOf(0.30f);
        char characterValue='K';
        String stringValue="Kiran";
        Date dateValue= new Date();
        String doubleasStringvalue=String.valueOf(doubleValue);


        System.out.println("Integer int " + intValue);
        System.out.println("Double double " + doubleValue);
        System.out.println("float float " + floatValue);
        System.out.println("doubleValue1 " + doubleValue1);
        System.out.println("floatValue1 " + floatValue1);
        System.out.println("character char " + characterValue);
        System.out.println("string String " + stringValue);
        System.out.println("date Date " + dateValue);
        System.out.println("doubleasStringvalue " + doubleasStringvalue);



        /*** Set these variables into the Mbo fields
        mbo.setValue("WONUM", intValue);          // Assuming WONUM is an integer field
        mbo.setValue("DESCRIPTION", stringValue); // Assuming DESCRIPTION is a string field
        mbo.setValue("DOUBLEFIELD", doubleValue); // Replace DOUBLEFIELD with actual field name
        mbo.setValue("FLOATFIELD", floatValue);   // Replace FLOATFIELD with actual field name
        mbo.setValue("CHARFIELD", String.valueOf(charValue)); // Replace CHARFIELD with actual field name
        mbo.setValue("DATEFIELD", dateValue);     // Replace DATEFIELD with actual field name

        // Save the Mbo
        mboSet.save();
         ***/



    }

    }


