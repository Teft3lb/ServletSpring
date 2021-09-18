package ru.appline.logic;

import java.io.Serializable;
import java.util.ArrayList;

public class CompasModel implements Serializable {
  private static final CompasModel instance = new CompasModel();

  private String buffer;
  ArrayList degrees = new ArrayList();
  public void add(String buf){ buffer = buf;
      String ranges[] = buf.split("-");
        try {
          for(String s : ranges)
          {
            if(s.indexOf('-') == -1)
            {
              degrees.add(Integer.parseInt(s));
            }else {
              String borders[] = buf.split("-");
              for (int i = Integer.parseInt(borders[0]); i <= Integer.parseInt(borders[1]); i++){
                degrees.add(i);
                  }
          }
        }}catch (NumberFormatException e)
        {
          System.err.println("Incorrect type");
        }


  ;}

//  public void parser()
  public static CompasModel getInstance() {
    return instance;
  }

  public ArrayList getall()
  {
    return  degrees;
  }
  public String get(){
    return buffer;
  }
}
