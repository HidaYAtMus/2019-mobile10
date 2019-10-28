package id.ac.polinema.colorchangernormal;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ColorviewModel extends AndroidViewModel {

    private int color = 0xfff;

    public ColorviewModel(@NonNull Application application) {
        super(application);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
