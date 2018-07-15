package Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {

    private ArrayList observers = new ArrayList();    // 保存Observer
    public void addObserver(Observer observer){      // 注册observer
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){    // 删除Observer
        observers.remove(observer);
    }
    public void notifyObservers(){              // 向Observer发送通知
        Iterator iter = observers.iterator();
        while(iter.hasNext()){
            Observer o = (Observer)iter.next();
            o.update(this);
        }
    }

    public abstract int getNumber();                // 获取数值
    public abstract void execute();                 // 生成数值
}
