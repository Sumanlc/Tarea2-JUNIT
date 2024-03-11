package es.iesmz.test;

public class DiasLluvia {

    private static boolean [] [] diasLluviosos;

    public DiasLluvia(){
        diasLluviosos = new boolean[12][31];
    }

    public static boolean registrarDia(int dia, int mes, boolean lluvia){
        if( mes < 1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("Error: Día no válido (" + dia + "/" + mes + ")");
            return false;
        }
        diasLluviosos[mes - 1 ][dia - 1] = lluvia;
        return true;
    }

    public boolean consultarDia( int dia, int mes){
        if(mes < 1 || mes > 12 || dia < 1 || dia > 31 ){
            System.out.println("Error: Día no válido (" + dia + "/" + mes + ")");
            return false;
        }
        return diasLluviosos [mes - 1] [dia - 1];
    }

    public int contarDiasLluviosos(){
        int cont = 0;
        for(boolean[] mes : diasLluviosos){
            for (boolean dia : mes){
                if(dia){
                    cont++;
                }
            }
        }
        System.out.println("Se han registrado " + cont + " días de lluvia");
        return cont;
    }

    public int trimestreLluvioso(){
        int[] trimestres = new int[4];

        for (int i = 0; i < 12; i++) {
            int trimestre = (i / 3) + 1;
            if (diasLluviosos[i][0]) {
                trimestres[trimestre - 1]++;
            }
        }

        int maximo = trimestres[0];
        int trimestreMaximo = 1;
        for (int i = 1; i < 4; i++) {
            if (trimestres[i] > maximo) {
                maximo = trimestres[i];
                trimestreMaximo = i + 1;
            }
        }
        System.out.println("El trimestre con más días de lluvia es el " + trimestreMaximo);
        return trimestreMaximo;
    }

    public int primerDiaLluvia(){
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 31; dia++) {
                if (diasLluviosos[mes][dia]) {
                    return dia + 1;
                }
            }
        }
        return -1;
    }



}
