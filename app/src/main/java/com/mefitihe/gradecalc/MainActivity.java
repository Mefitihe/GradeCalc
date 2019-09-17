package com.mefitihe.gradecalc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    Spinner am, eng, phy, math, bio, hist, chem, civ, geo, other;
    Button btn_calc;
    TextView view_cgpa;
    Context mContext;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_telegram:
                    Uri website = Uri.parse("https://t.me/mefitihe");

                    Intent startWebsite = new Intent(Intent.ACTION_VIEW, website);

                    if (startWebsite.resolveActivity(getPackageManager()) != null) {
                        startActivity(startWebsite);
                    }
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        am = findViewById(R.id.grd_am);
        eng = findViewById(R.id.grd_eng);
        phy = findViewById(R.id.grd_phy);
        math = findViewById(R.id.grd_math);
        bio = findViewById(R.id.grd_bio);
        hist = findViewById(R.id.grd_his);
        chem = findViewById(R.id.grd_chem);
        civ = findViewById(R.id.grd_civic);
        geo = findViewById(R.id.grd_geo);
        other = findViewById(R.id.other);
        btn_calc = findViewById(R.id.btn_calc);
        view_cgpa = findViewById(R.id.view_cgpa);

        setBtn_calc();

    }

    private void setBtn_calc() {
        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amh = am.getSelectedItem().toString();
                String en = eng.getSelectedItem().toString();
                String ph = phy.getSelectedItem().toString();
                String m = math.getSelectedItem().toString();
                String b = bio.getSelectedItem().toString();
                String h = hist.getSelectedItem().toString();
                String ch = chem.getSelectedItem().toString();
                String civic = civ.getSelectedItem().toString();
                String geog = geo.getSelectedItem().toString();
                String oth = other.getSelectedItem().toString();
                double grade_am = 0, grade_en = 0, grade_ph = 0, grade_m = 0, grade_b = 0, grade_h = 0, grade_ch = 0, grade_c = 0, grade_geo = 0, grade_oth = 0;
                if (amh.equals("A")) {
                    grade_am = 4;
                } else if (amh.equals("B")) {
                    grade_am = 3;
                } else if (amh.equals("C")) {
                    grade_am = 2;
                } else if (amh.equals("F")) {
                    grade_am = 0;
                }

                //English
                if (en.equals("A")) {
                    grade_en = 4;
                } else if (en.equals("B")) {
                    grade_en = 3;
                } else if (en.equals("C")) {
                    grade_en = 2;
                } else if (en.equals("D")) {
                    grade_en = 1;
                } else if (en.equals("F")) {
                    grade_en = 0;
                }


                //Civics
                if (civic.equals("A")) {
                    grade_c = 4;
                } else if (civic.equals("B")) {
                    grade_c = 3;
                } else if (civic.equals("C")) {
                    grade_c = 2;
                } else if (civic.equals("D")) {
                    grade_c = 1;
                } else if (civic.equals("F")) {
                    grade_c = 0;
                }


                //Maths
                if (m.equals("A")) {
                    grade_m = 4;
                } else if (m.equals("B")) {
                    grade_m = 3;
                } else if (m.equals("C")) {
                    grade_m = 2;
                } else if (m.equals("D")) {
                    grade_m = 1;
                } else if (m.equals("F")) {
                    grade_m = 0;
                }


                //Physics
                if (ph.equals("A")) {
                    grade_ph = 4;
                } else if (ph.equals("B")) {
                    grade_ph = 3;
                } else if (ph.equals("C")) {
                    grade_ph = 2;
                } else if (ph.equals("D")) {
                    grade_ph = 1;
                } else if (ph.equals("F")) {
                    grade_ph = 0;
                }

                //Chemistry
                if (ch.equals("A")) {
                    grade_ch = 4;
                } else if (ch.equals("B")) {
                    grade_ch = 3;
                } else if (ch.equals("C")) {
                    grade_ch = 2;
                } else if (ch.equals("D")) {
                    grade_ch = 1;
                } else if (ch.equals("F")) {
                    grade_ch = 0;
                }
                //Biology
                if (b.equals("A")) {
                    grade_b = 4;
                } else if (b.equals("B")) {
                    grade_b = 3;
                } else if (b.equals("C")) {
                    grade_b = 2;
                } else if (b.equals("D")) {
                    grade_b = 1;
                } else if (b.equals("F")) {
                    grade_b = 0;
                }

                //History
                if (h.equals("A")) {
                    grade_h = 4;
                } else if (h.equals("B")) {
                    grade_h = 3;
                } else if (h.equals("C")) {
                    grade_h = 2;
                } else if (h.equals("D")) {
                    grade_h = 1;
                } else if (h.equals("F")) {
                    grade_h = 0;
                }

                //Chemistry
                if (ch.equals("A")) {
                    grade_ch = 4;
                } else if (ch.equals("B")) {
                    grade_ch = 3;
                } else if (ch.equals("C")) {
                    grade_ch = 2;
                } else if (ch.equals("D")) {
                    grade_ch = 1;
                } else if (ch.equals("F")) {
                    grade_ch = 0;
                }

                //Geography
                if (geog.equals("A")) {
                    grade_geo = 4;
                } else if (geog.equals("B")) {
                    grade_geo = 3;
                } else if (geog.equals("C")) {
                    grade_geo = 2;
                } else if (geog.equals("D")) {
                    grade_geo = 1;
                } else if (geog.equals("F")) {
                    grade_geo = 0;
                }

                //other language
                if (oth.equals("A")) {
                    grade_oth = 4;
                } else if (oth.equals("B")) {
                    grade_oth = 3;
                } else if (oth.equals("C")) {
                    grade_oth = 2;
                } else if (oth.equals("D")) {
                    grade_oth = 1;
                } else if (oth.equals("F")) {
                    grade_oth = 0;
                }

                double total = grade_am + grade_m + grade_b + grade_c + grade_ch + grade_en + grade_geo + grade_h + grade_oth + grade_ph;
                double average = total / 7;
                NumberFormat f = new DecimalFormat("#.##");

                view_cgpa.setText("Total : " + f.format(average));
            }


        });
    }

}
