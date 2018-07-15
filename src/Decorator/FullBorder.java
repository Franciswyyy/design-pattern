package Decorator;

public class FullBorder extends Border{

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0){
            return "+" + makeLine('-', display.getColumns()) + "+";   // 上边框
        }else if(row == display.getRows() + 1){
            return "+" + makeLine('-', display.getColumns()) + "+";   // 下边框
        }else{
            return "|" + display.getRowText(row-1) + "|";
        }
    }

    private String makeLine(char ch, int count){ // 生成一个count次的ch字符
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < count; i ++){
            sb.append(ch);
        }
        return sb.toString();
    }
}
