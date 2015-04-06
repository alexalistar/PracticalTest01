package ro.pub.cs.systems.pdsd.practicaltest01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class PracticalTest01MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);
        
        
        TextView editText1;
		TextView editText2;
		if (savedInstanceState != null) {
            String editText11 = savedInstanceState.getString("editText1");
            if (editText11 != null) {
              editText11.setText(editText11);
            } else {
              editText11.setText(String.valueOf(0));
            }
            String editText2 = savedInstanceState.getString("editText2");
            if (editText2 != null) {
              editText2.setText(editText2);
            } else {
              editText2.setText(String.valueOf(0));
            }
          } else {
            editText1.setText(String.valueOf(0));
            editText2.setText(String.valueOf(0));
          }
          
        
        
    }
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
      EditText editText1 = (EditText)findViewById(R.id.editText1);
      EditText editText2 = (EditText)findViewById(R.id.editText2);
      savedInstanceState.putString("editText1", editText1.getText().toString());
      savedInstanceState.putString("editText2", editText2.getText().toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test01_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
