package com.skypro.greeter030125;

import com.skypro.greeter030125.service.GreeterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest// Работает и через new и через @Autowired(Автоповодка)

public class GreeterServiceTest {
private final GreeterService greeterService = new GreeterService();
    //   @Autowired
//  private GreeterService greeterService; // когда через @SpringBootTest надо убирать final?????
//Когда вы используете аннотацию @Autowired в тестах с Spring, поле не может быть final, потому что Spring
// пытается инжектировать зависимость в это поле после создания объекта теста. В частности, зависимость
// инжектируется в объект через механизм рефлексии в момент, когда контейнер Spring завершает свою работу
// по инициализации контекста приложения. Поля с модификатором final нельзя изменить после того, как объект
// был создан, поэтому Spring не может инжектировать зависимость в такие поля.
    @Test
    @DisplayName("Когда имя дано, метод greet возвращает приветствие + имя")
    public void withName() {
        String result = greeterService.greet("Jahan");
        Assertions.assertEquals("Hello,Jahan", result);
    }

}
