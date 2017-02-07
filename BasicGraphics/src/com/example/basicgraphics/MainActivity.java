package com.example.basicgraphics;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	DemoView demo;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		demo = new DemoView(this);
		setContentView(demo);
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
			paint.setColor(Color.MAGENTA);
			canvas.drawCircle(20, 20, 15, paint);
			paint.setAntiAlias(false);
			paint.setColor(Color.MAGENTA);
			canvas.drawLine(10, 10,0,0, paint);

			
			paint.setAntiAlias(false);
			paint.setColor(Color.RED);
			canvas.drawRect(75,15, 100, 30, paint);

			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
