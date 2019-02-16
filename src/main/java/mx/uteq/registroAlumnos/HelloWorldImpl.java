
package mx.uteq.registroAlumnos;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.uteq.registroAlumnos.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
 static List <Alumno> alumnos = new ArrayList<>();
	
    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public Alumno saveAlumno(Alumno alumno) {
		alumnos.add(alumno);
		return alumno;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Alumno> getAll() {
		// TODO Auto-generated method stub
		return alumnos;
	}
}

