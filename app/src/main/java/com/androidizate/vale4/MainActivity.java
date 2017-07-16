package com.androidizate.vale4;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int puntajeNosotros = 0;
    int puntajeEllos = 0;

    TextView scoreNosotros;
    Button envidoNosotros;
    Button realEnvidoNosotros;
    Button faltaEnvidoNosotros;
    Button trucoNosotros;
    Button reTrucooNosotros;
    Button valeCuatroNosotros;
    Button puntoNosotros;
    Button sumarPuntoNosotros;
    Button restarPuntoNosotros;

    TextView scoreEllos;
    Button envidoEllos;
    Button realEnvidoEllos;
    Button faltaEnvidoEllos;
    Button trucoEllos;
    Button reTrucooEllos;
    Button valeCuatroEllos;
    Button puntoEllos;
    Button sumarPuntoEllos;
    Button restarPuntoEllos;

    Button borrarPuntajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNosotros();
        initEllos();

        borrarPuntajes = (Button) findViewById(R.id.btn_reset);
        borrarPuntajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetearPuntaje();
            }
        });
    }

    private void initEllos() {
        scoreEllos = (TextView) findViewById(R.id.score_ellos);

        envidoEllos = (Button) findViewById(R.id.btn_envido_ellos);
        envidoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarEnvidoEllos();
            }
        });

        realEnvidoEllos = (Button) findViewById(R.id.btn_real_envido_ellos);
        realEnvidoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarRealEnvidoEllos();
            }
        });

        faltaEnvidoEllos = (Button) findViewById(R.id.btn_falta_envido_ellos);
        faltaEnvidoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarFaltaEnvidoEllos();
            }
        });

        trucoEllos = (Button) findViewById(R.id.btn_truco_ellos);
        trucoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarTrucoEllos();
            }
        });

        reTrucooEllos = (Button) findViewById(R.id.btn_re_truco_ellos);
        reTrucooEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarReTrucoEllos();
            }
        });

        valeCuatroEllos = (Button) findViewById(R.id.btn_vale_cuatro_ellos);
        valeCuatroEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarValeCuatroEllos();
            }
        });

        puntoEllos = (Button) findViewById(R.id.btn_punto_ellos);
        puntoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarPuntoEllos();
            }
        });

        sumarPuntoEllos = (Button) findViewById(R.id.btn_sumar_uno_ellos);
        sumarPuntoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarPuntoEllos();
            }
        });

        restarPuntoEllos = (Button) findViewById(R.id.btn_restar_uno_ellos);
        restarPuntoEllos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restarPuntoEllos();
            }
        });
    }

    private void initNosotros() {
        scoreNosotros = (TextView) findViewById(R.id.score_nosotros);

        envidoNosotros = (Button) findViewById(R.id.btn_envido_nosotros);
        envidoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarEnvidoNosotros();
            }
        });

        realEnvidoNosotros = (Button) findViewById(R.id.btn_real_envido_nosotros);
        realEnvidoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarRealEnvidoNosotros();
            }
        });

        faltaEnvidoNosotros = (Button) findViewById(R.id.btn_falta_envido_nosotros);
        faltaEnvidoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarFaltaEnvidoNosotros();
            }
        });

        trucoNosotros = (Button) findViewById(R.id.btn_truco_nosotros);
        trucoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarTrucoNosotros();
            }
        });

        reTrucooNosotros = (Button) findViewById(R.id.btn_re_truco_nosotros);
        reTrucooNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarReTrucoNosotros();
            }
        });

        valeCuatroNosotros = (Button) findViewById(R.id.btn_vale_cuatro_nosotros);
        valeCuatroNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarValeCuatroNosotros();
            }
        });

        puntoNosotros = (Button) findViewById(R.id.btn_punto_nosotros);
        puntoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarPuntoNosotros();
            }
        });

        sumarPuntoNosotros = (Button) findViewById(R.id.btn_sumar_uno_nosotros);
        sumarPuntoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarPuntoNosotros();
            }
        });

        restarPuntoNosotros = (Button) findViewById(R.id.btn_restar_uno_nosotros);
        restarPuntoNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restarPuntoNosotros();
            }
        });
    }

    private void restarPuntoEllos() {
        if (puntajeEllosMayorACero()) {
            puntajeEllos -= 1;
            cambiarScoreEllos();
        }
    }

    private void restarPuntoNosotros() {
        if (puntajeNosotrosMayorACero()) {
            puntajeNosotros -= 1;
            cambiarScoreNosotros();
        }
    }

    private void sumarPuntoEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 1;
            cambiarScoreEllos();
        }
    }

    private void sumarPuntoNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 1;
            cambiarScoreNosotros();
        }
    }

    private void sumarEnvidoEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 2;
            cambiarScoreEllos();
        }
    }

    private void sumarEnvidoNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 2;
            cambiarScoreNosotros();
        }
    }

    private void sumarRealEnvidoEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 3;
            cambiarScoreEllos();
        }
    }

    private void sumarRealEnvidoNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 3;
            cambiarScoreNosotros();
        }
    }

    private void sumarFaltaEnvidoEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 30 - puntajeNosotros;
            cambiarScoreEllos();
        }
    }

    private void sumarFaltaEnvidoNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 30 - puntajeEllos;
            cambiarScoreNosotros();
        }
    }

    private void sumarTrucoEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 2;
            cambiarScoreEllos();
        }
    }

    private void sumarTrucoNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 2;
            cambiarScoreNosotros();
        }
    }

    private void sumarReTrucoEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 3;
            cambiarScoreEllos();
        }
    }

    private void sumarReTrucoNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 3;
            cambiarScoreNosotros();
        }
    }

    private void sumarValeCuatroEllos() {
        if (puntajeEllosMenorATreinta()) {
            puntajeEllos += 4;
            cambiarScoreEllos();
        }
    }

    private void sumarValeCuatroNosotros() {
        if (puntajeNosotrosMenorATreinta()) {
            puntajeNosotros += 4;
            cambiarScoreNosotros();
        }
    }

    private void cambiarScoreEllos() {
        if (puntajeEllos >= 30) {
            puntajeEllos = 30;
            new AlertDialog.Builder(this)
                    .setTitle("Fin de la partida")
                    .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            puntajeEllos = 0;
                            puntajeNosotros = 0;
                            cambiarScoreEllos();
                            cambiarScoreNosotros();
                            dialogInterface.dismiss();
                        }
                    })
                    .setMessage("Ganaron ELL@S!!")
                    .show();
        }
        scoreEllos.setText(String.valueOf(puntajeEllos));
    }

    private void cambiarScoreNosotros() {
        if (puntajeNosotros >= 30) {
            puntajeNosotros = 30;
            new AlertDialog.Builder(this)
                    .setTitle("Fin de la partida")
                    .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            puntajeEllos = 0;
                            puntajeNosotros = 0;
                            cambiarScoreEllos();
                            cambiarScoreNosotros();
                            dialogInterface.dismiss();
                        }
                    })
                    .setMessage("Ganamos NOSOTR@S!!")
                    .show();
        }
        scoreNosotros.setText(String.valueOf(puntajeNosotros));
    }

    private boolean puntajeEllosMayorACero() {
        return puntajeEllos > 0;
    }

    private boolean puntajeNosotrosMayorACero() {
        return puntajeNosotros > 0;
    }

    private boolean puntajeEllosMenorATreinta() {
        return puntajeEllos < 30;
    }

    private boolean puntajeNosotrosMenorATreinta() {
        return puntajeNosotros < 30;
    }

    private void resetearPuntaje() {
        new AlertDialog.Builder(this)
                .setTitle("Cuidado")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        puntajeEllos = 0;
                        puntajeNosotros = 0;
                        cambiarScoreEllos();
                        cambiarScoreNosotros();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setMessage("Está seguro que desea borrar el puntaje y empezar nuevamente?")
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
