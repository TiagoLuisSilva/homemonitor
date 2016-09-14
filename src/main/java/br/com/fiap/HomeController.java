package br.com.fiap;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/consumo")
    public ResponseEntity<HomeVO> consumo() {
    	HomeVO home = new HomeVO();
    	home.setAguaCubicos(getRandom());
    	home.setCorrente(getRandom());
        return new ResponseEntity<HomeVO>(home, HttpStatus.OK);
    }
    
    
    public  BigDecimal getRandom(){ 
    	float minX = 50.0f;
    	float maxX = 100.0f;

    	Random rand = new Random();

    	float finalX = rand.nextFloat() * (maxX - minX) + minX;
            BigDecimal randFromDouble = BigDecimal.valueOf(finalX);
            return randFromDouble;
    }
}
