package service;

import entities.SPID;
import entities.TestSPID;
import entities.User;
import entities.Status;

import java.util.HashMap;



public class SpidApp  {
    public static void main(String[] args)  throws Exception {
        User firstUser=new User(1,"Sindi","Mio","Msindi");
        SPID firstSPID=new SPID(1,firstUser, Status.PENDING,"SSspo");
        SPID secondSPID=new SPID(2,firstUser, Status.PENDING,"olod");
        SPID thirdSPID=new SPID(3,firstUser, Status.PENDING,"podil");
        SPID fourthSPID=new SPID(4,firstUser, Status.PENDING,"kledlo");
        SPID fifthSPID=new SPID(5,firstUser, Status.PENDING,"Lodwl");

        firstUser.setId(2);
        firstUser.setName("Klea");
        firstUser.setSurname("Velo");
        firstUser.setUsername("Vklea");

        User secondUser=new User(3,"Megi","Tuse","Tuple");
        firstSPID.setUser(secondUser);
        firstSPID.setStatus(Status.APPROVED);
        firstSPID.setDescripton("leggo");

        HashMap<Integer,SPID> listSPID=new HashMap();
        listSPID.put(0,firstSPID);
        listSPID.put(1,secondSPID);
        listSPID.put(2,thirdSPID);
        listSPID.put(3,fourthSPID);
        listSPID.put(4,fifthSPID);
        listSPID.put(5,null);


        for (HashMap.Entry<Integer, SPID> list :
                listSPID.entrySet()) {
            if(list.getValue()==null){
                throw new Exception("Null values for SPID are not Allowed");
            }
            System.out.println(list.toString());
        }

        //Spid connected to a user
        System.out.println("User:"+ firstUser.getName()+"is connected to SPID with description "+ listSPID.get(0).getDescripton() );

        secondSPID.setStatus(Status.APPROVED);



        // TestSPID testSPID=new TestSPID();
       // testSPID.createdAt=firstUser.getName()/firstSPID.getUser().getName();
    }
}
