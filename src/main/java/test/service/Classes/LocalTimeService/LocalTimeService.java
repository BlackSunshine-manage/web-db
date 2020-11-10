package test.service.Classes.LocalTimeService;

import org.springframework.stereotype.Component;
import test.service.Interfaces.localTimeServiceInterface.LocalTimeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Component
public class LocalTimeService implements LocalTimeServiceInterface {


    private Date date ;
    private String dateFormat;


    @Autowired
    public LocalTimeService() {
        this.date = new Date();
        this.dateFormat= this.getNowDate();
    }

/**
 * @return function returned now data and time in format "Дата:  yyyy.MM.dd   Время: HH:mm:ss"
 * */
    @Override
    public String getNowDate(){
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("Дата:  yyyy.MM.dd   Время: HH:mm:ss");
        return formatForDateNow.format(new Date());
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
}
