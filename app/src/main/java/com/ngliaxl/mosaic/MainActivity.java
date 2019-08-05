package com.ngliaxl.mosaic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ngliaxl.mosaic.mosaic.DrawMosaicView;
import com.ngliaxl.mosaic.mosaic.MosaicUtil;

/**
 * 代码来自
 * https://github.com/jarlen/PhotoEditDemo
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DrawMosaicView mosaicView = findViewById(R.id.draw_mosaic_view);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        mosaicView.setMosaicBackgroundResource(bitmap);

        Bitmap bit = MosaicUtil.getMosaic(bitmap);

        mosaicView.setMosaicResource(bit);
        mosaicView.setMosaicBrushWidth(30);


        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mosaicView.clear();
            }
        });

        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap mosaicBitmap = mosaicView.getMosaicBitmap();
            }
        });
    }
}
