package com.example.shubham.rajasthanproject;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class MapsMarkerActivity extends AppCompatActivity
        implements OnMapReadyCallback {
    //26.9124° N, 75.7873°
    double lati=26.9124;
    double longi=75.783;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);


        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        //LatLng sydney = new LatLng(-33.852, 151.211);
        LatLng pos1 = new LatLng(lati,longi);
        LatLng pos2 = new LatLng(lati+0.0012,longi+0.0023);
        Geocoder geocoder = new Geocoder(this);
        List<Address> adress;
        String location="Jaipur";
        try {
            adress = geocoder.getFromLocation(lati,longi,1);
            location = adress.get(0).getLocality();
        }
        catch (Exception e){
            Log.e("Error",e.getMessage().toString());
        }
        final LatLngBounds pos_bound = new LatLngBounds( new LatLng(lati-1, longi-1), new LatLng(lati+1, longi+1));

        googleMap.addMarker(new MarkerOptions().position(pos1).title("Water Body 1,"+location).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(pos2).title("Water Body 2,"+location).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        final CameraPosition pos_camera = new CameraPosition.Builder().target(pos_bound.getCenter()).zoom(15).tilt(45).build();

        googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {
                //googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(pos_bound,0));
                googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(pos_camera));
            }
        });
    }
}