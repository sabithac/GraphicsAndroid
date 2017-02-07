package com.example.basicgraphics;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {
	DemoView demo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        demo=new DemoView(this);
        setContentView(R.layout.activity_main);
    }
    private class DemoView extends View {
		public DemoView(Context mcontext) {
			super(mcontext);
		}
    @Override
    protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);
		paint.setColor(Color.CYAN);
		canvas.drawPaint(paint);
		paint.setAntiAlias(false);
		paint.setColor(Color.RED);
		canvas.drawLine(10,5,0,0, paint);
		paint.setAntiAlias(false);
		paint.setColor(Color.MAGENTA);
		canvas.drawCircle(10, 10, 10, paint);
		paint.setAntiAlias(false);
		paint.setColor(Color.RED);
		canvas.drawRect(100, 5, 200, 30, paint);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    }
}
