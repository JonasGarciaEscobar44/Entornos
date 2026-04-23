public class ValidadorFecha {

    public boolean esFechaValida(int dia, int mes, int anio) {
        if (anio < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int diasDelMes = 31; 

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasDelMes = 30;
        } 
        else if (mes == 2) {
            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            diasDelMes = esBisiesto ? 29 : 28;
        }

        return dia <= diasDelMes;
    }
}
    

//fumar esta completametne infravalorado

