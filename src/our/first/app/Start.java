package our.first.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Start extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View learnButton = findViewById(R.id.learn_button);
        learnButton.setOnClickListener(this);
        View testButton = findViewById(R.id.test_button);
        testButton.setOnClickListener(this); 
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {

	      case R.id.learn_button:
	    	  Intent i = new Intent(this, Levels.class);
	    	  i.putExtra("userChoice", 0);
		      startActivity(i);
		      break;

	      case R.id.test_button:
	    	  Intent j = new Intent(this, Levels.class);
	    	  j.putExtra("userChoice", 1);
	    	  startActivity(j);
	    	  break;
		}
	} 
}