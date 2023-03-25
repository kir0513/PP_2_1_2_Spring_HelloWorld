import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration//Указывает, что класс объявляет один или несколько @Bean методов и может обрабатываться контейнером
// Spring для генерации определений компонентов и запросов на обслуживание для этих компонентов во время выполнения
public class AppConfig {
 
    @Bean(name="helloworld")// используется для обьявления бина
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat(){
        return new Cat();
    }
}