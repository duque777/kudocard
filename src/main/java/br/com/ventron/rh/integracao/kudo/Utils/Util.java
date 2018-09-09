package br.com.ventron.rh.integracao.kudo.Utils;

import java.util.Calendar;
import java.util.Date;

public class Util {

    public static Date getNewDate(){
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }
}
