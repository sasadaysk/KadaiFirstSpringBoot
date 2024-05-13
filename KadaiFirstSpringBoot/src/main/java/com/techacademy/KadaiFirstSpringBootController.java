package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstSpringBootController {
    //指定曜日算出
    @GetMapping("/dayofweek/{dateStr}")
    public String dispDayOfWeek(@PathVariable String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.BASIC_ISO_DATE);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
    
    //足し算
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        var res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
    //引き算
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        var res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }
    //掛け算    
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        var res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }
    //割り算
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        var res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
}
