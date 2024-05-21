package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Message;

public class ProductValidation {

    private General general = new General();

    //Validacion producto

    public boolean namevalidation (String name) throws Exception{
        String regex ="^[a-zA-Z\\\\s]+$";
        boolean matcher=this.general.regexValidation(regex,name);
        if (!matcher){ //NO HUBO COINCIDENCIA
            throw new Exception(Message.FORMAT_NAME.getMessage());
        }
        return true;
    }

    public boolean priceValidation (Integer price){
        return true;
    }

    public boolean descriptionValidation(){
        return true;
    }
    }

