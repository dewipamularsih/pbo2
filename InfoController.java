/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InfoTool;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class InfoController {
    private List<InfoView>list;
    private InfoModel infoModel;
    
    public InfoController() { 
        list = new ArrayList<InfoView>(); 
        infoModel = new InfoModel("Dingiiiin", "Ujan derez"); 
    }
    public void addInfoView(InfoView viewInfo) { 
        list.add(viewInfo); 
    } 
    public void updateMessage(String message) { 
        infoModel.setMessage(message); 
        for (InfoView infoView : list) { 
        infoView.getLblMessage().setText("Message : " + message); 
    } 
   }
    public void updateWeather(String weather) { 
        infoModel.setWeather(weather); 
        for (InfoView infoView : list) { 
            infoView.getLblWeather().setText("Weather : " + weather); 
        } 
    } 
    public String getWeather(){
        return infoModel.getWeather();
    }
    public String getMessage(){
        return infoModel.getMessage();
    }
    
}
