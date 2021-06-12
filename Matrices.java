public class Matrices{
    private int a;
    private int b;
    private int [][] nros = new int [a][b];
    public Matrices(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int [][] Caracol(){
        int filas = a;
        int columnas = b;
        int [][] nros = new int [filas][columnas];
        int x = 1;
        int comienzo = 0;
        int rango = a - 1;
        while(x <= a * a){
            for(int j = comienzo; j <= rango; j = j + 1){
                nros[comienzo][j] = x;
                x = x + 1;
            }
            for(int i = comienzo + 1; i <= rango; i = i + 1){
                nros[i][rango] = x;
                x = x + 1;
            }
            for(int j = rango - 1; j >= comienzo; j = j - 1){
                nros[rango][j] = x;
                x = x + 1;
            }
            for(int i = rango - 1; i >= comienzo + 1; i = i - 1){
                nros[i][comienzo] = x;
                x = x + 1;
            }
            comienzo = comienzo + 1;
            rango = rango - 1;
        }
        return nros;
    }
    public void impresion(int a[][]){
        for(int i = 0; i < a.length; i = i + 1){
            for(int j = 0; j < a[0].length; j = j + 1){
                System.out.print(a[i][j] + " "); 
            }
            System.out.println();
        }
    }
    public int [][] recorridoX(){
        int filas = a;
        int columnas = b;
        int [][] nros = new int [filas][columnas];
        int marcado = 1;
        boolean bandera = true;
        int x = 0;
        for(int i = 0; i < nros.length; i++){
            for(int j = 0; j < nros.length; j++){
            if(i == j){
                nros[i][j] = marcado;
            }else{
                nros[i][j] = 0;
            }
            }
        }
        for(int i = nros.length - 1; i >= 0; i--){
            nros[i][x] = marcado;
            x++;
        }
        return nros;
    }
}
