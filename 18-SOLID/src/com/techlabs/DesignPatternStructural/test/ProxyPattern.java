package com.techlabs.DesignPatternStructural.test;

//Step 1: Common interface
interface Permission {
 void requestPermission(String reason);
}

//Step 2: Real object – Principal
class Principal implements Permission {
 public void requestPermission(String reason) {
     System.out.println("Principal: Permission granted for - " + reason);
 }
}

//Step 3: Proxy – Teacher
class TeacherProxy implements Permission {
 private Principal principal = new Principal();

 public void requestPermission(String reason) {
     if (isValidReason(reason)) {
         System.out.println("Teacher: Valid reason. Forwarding to Principal...");
         principal.requestPermission(reason); // delegate to real object
     } else {
         System.out.println("Teacher: Invalid reason. Permission denied.");
     }
 }

 private boolean isValidReason(String reason) {
     return reason.equalsIgnoreCase("medical") || reason.equalsIgnoreCase("family emergency");
 }
}

//Step 4: Client – Student
public class ProxyPattern {
 public static void main(String[] args) {
     Permission teacher = new TeacherProxy();

     System.out.println("▶ Student: Asking for 'picnic' leave");
     teacher.requestPermission("picnic");

     System.out.println("\n▶ Student: Asking for 'medical' leave");
     teacher.requestPermission("medical");
 }
}

