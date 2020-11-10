package observer.questao1.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
* Métricas meramente ilustrativas. Não representam a realidade e tampouco são cientificamente fundamentadas.
* */
public class GenericUtils {

    public static String dateFormat(Date date){
        Locale local = new Locale("pt","BR");
        DateFormat format = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy",local);
        return format.format(date);
    }

    public static String weatherPrediction(Float temperature, Float humidity){
        if(temperature <= 25f && humidity <= 60f){
            return "Nublado";
        } else if(temperature <= 20f && humidity <= 100f){
            return "Chuvoso";
        } else if(temperature >= 26f && humidity <= 59f){
            return "Ensolarado";
        } else {
            return "Indefinido";
        }
    }

    public static String saySomething(String weatherPrediction){
        switch (weatherPrediction){
            case "Nublado":
                return "O dia está nublado. Fique atento, leve um guarda-chuva, pode ser que chova!";
            case "Chuvoso":
                return "Está chovendo bastante. Certifique-se de levar o guarda-chuva ao sair.";
            case "Ensolarado":
                return "Está ensolarado! Pode sair sem medo, bota a cara no mundo!";
            default:
                return "Erro na leitura dos dados.";
        }
    }

}
