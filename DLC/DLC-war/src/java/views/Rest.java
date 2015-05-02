/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.json.simple.JSONObject;

/**
 *
 * @author Nico
 */
@ManagedBean
@RequestScoped
public class Rest implements Serializable{
    
  
    
    public Rest()
    {
        
    }
    
    public String getResponse()
    {
        JSONObject obj=new JSONObject();
  obj.put("name","foo");
  obj.put("num",new Integer(100));
  obj.put("balance",new Double(1000.21));
  obj.put("is_vip",new Boolean(true));
  obj.put("nickname",null);
  System.out.print(obj);
        
        return obj.toString();
    }
    
}
