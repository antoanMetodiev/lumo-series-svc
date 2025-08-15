package com.example.streammateseriessvc.app.scheduled;

import com.example.streammateseriessvc.app.feather.repositories.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseRequestPerDay {

    private final SeriesRepository seriesRepository;

    @Autowired
    public DatabaseRequestPerDay(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    @Scheduled(cron = "0 0 0,12 * * ?", zone = "Europe/Sofia")
    public void heartBeatSelf() {
        try {
            seriesRepository.count();
            System.out.println("=====>>>>>>>>>>>>>  Database Ping Request..!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
