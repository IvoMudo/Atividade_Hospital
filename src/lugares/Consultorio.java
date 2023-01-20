package lugares;

import pessoas.Medico;

    public class Consultorio extends Sala{

    private Medico medicoAtendente;
    public Consultorio() {
        super(true);
    }

    public Consultorio(Medico medicoAtendente) {
        this();
        this.medicoAtendente = medicoAtendente;
    }
}
