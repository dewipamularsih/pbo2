/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InfoTool;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) { 
 // TODO code application logic here 
 InfoView infoView1=new InfoView(); 
 infoView1.setVisible(true); 
 InfoView infoView2=new InfoView(); 
 infoView2.setVisible(true); 
 InfoController infoController=new InfoController(); 
 infoController.addInfoView(infoView1); 
 infoController.addInfoView(infoView2); 
 infoView1.setInfoController(infoController); 
 infoView2.setInfoController(infoController); }
}
