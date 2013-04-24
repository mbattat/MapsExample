package postpc.example.mapsexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapsActivity extends FragmentActivity {

	static final LatLng JERUSALEM = new LatLng(31.768, 35.214);
	static final LatLng TEL_AVIV = new LatLng(32.066, 34.777);
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_google_maps);
		
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//		Marker jerusalem = map.addMarker(new MarkerOptions().position(JERUSALEM).title("Jerusalem"));
//		Marker telAviv = map.addMarker(new MarkerOptions().position(TEL_AVIV).title("Tel Aviv"));
//
//		// Move the camera instantly to Jerusalem with a zoom of 15.
//		map.moveCamera(CameraUpdateFactory.newLatLngZoom(JERUSALEM, 15));
//
//		// Zoom in, animating the camera.
//		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.google_maps, menu);
		return true;
	}

}
