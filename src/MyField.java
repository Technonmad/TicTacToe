public class MyField {
    public char[][] field =
            {
                    {'+','+','+'},
                    {'+','+','+'},
                    {'+','+','+'}
            };
    public void showField(){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public void editFieldX(int x, int y){
        field[y][x] = 'x';
        showField();
    }

    public void editFieldO(int x, int y){
        field[y][x] = 'o';
        showField();
    }

    public boolean checkFreeSpace() {
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                if(field[j][i] == '+')
                    count++;
            }
        }
        if(count == 0)
            return false;
        else return true;
    }

    public boolean checkWin1(){
        if ((field[0][0] == 'x' && field[1][1] == 'x' && field[2][2] == 'x')
                ||(field[2][0] == 'x' && field[1][1] == 'x' && field[0][2] == 'x')
                ||(field[0][0] == 'x' && field[1][0] == 'x' && field[2][0] == 'x')
                ||(field[0][1] == 'x' && field[1][1] == 'x' && field[2][1] == 'x')
                ||(field[0][2] == 'x' && field[1][2] == 'x' && field[2][2] == 'x')
                ||(field[0][0] == 'x' && field[0][1] == 'x' && field[0][2] == 'x')
                ||(field[1][0] == 'x' && field[1][1] == 'x' && field[1][2] == 'x')
                ||(field[2][0] == 'x' && field[2][1] == 'x' && field[2][2] == 'x')){
            return true;
        }
        else return false;
    }

    public boolean checkWin2(){
        if ((field[0][0] == 'o' && field[1][1] == 'o' && field[2][2] == 'o')
                ||(field[2][0] == 'o' && field[1][1] == 'o' && field[0][2] == 'o')
                ||(field[0][0] == 'o' && field[1][0] == 'o' && field[2][0] == 'o')
                ||(field[0][1] == 'o' && field[1][1] == 'o' && field[2][1] == 'o')
                ||(field[0][2] == 'o' && field[1][2] == 'o' && field[2][2] == 'o')
                ||(field[0][0] == 'o' && field[0][1] == 'o' && field[0][2] == 'o')
                ||(field[1][0] == 'o' && field[1][1] == 'o' && field[1][2] == 'o')
                ||(field[2][0] == 'o' && field[2][1] == 'o' && field[2][2] == 'o')){
            return true;
        }
        else return false;
    }
}
