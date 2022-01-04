

/*
 * 	T�tulo: Interfaz Gr�fica
 * 	Nombre: H�ctor Paredes Benavides
 * 	Descripci�n: Creamos una interfaz gr�fica para el programa de expediciones
 */

package interfazGrafica;

// Bibliotecas de Java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Clases del programa
import clasesPrograma.*;

public class InterfazGrafica extends JFrame implements ActionListener{

	/* Constantes */
	public static final int NUMERO_MAX_COLUMNAS_TEXT_FIELD = 5;
	public static final int NUMERO_MAX_FILAS_TEXT_AREA = 50;
	public static final int NUMERO_MAX_COLUMNAS_TEXT_AREA = 20;
	
	/* Atributos */
	// Paneles de la ventana principal
	private Container materialDisponibleContentPane;
	private Container introduccionDatosContentPane;
	private Container materialExpedicionContentPane;
	private Container volcarFicheroContentPane;
	
	// Paneles del panel de introducci�n de datos
	private Container introduccionNumeroPersonasContentPane;
	private Container introduccionPesoContentPane;
	private Container introduccionExpedicionPeligrosaContentPane;
	
	// Etiqueta t�tulo de ventanas y paneles
	private JLabel etiquetaTituloVentana;
	private JLabel etiquetaTituloPanelMaterialDisponible;
	private JLabel etiquetaTituloPanelMaterialExpedicion;
	
	// Etiquetas del panel de material disponible
	private JLabel etiquetaOficialesDisponibles;
	private JLabel etiquetaGuardiasDisponibles;
	private JLabel etiquetaOperariosDisponibles;
	private JLabel etiquetaArmasDisponibles;
	private JLabel etiquetaCajasDisponibles;
	private JLabel etiquetaVehiculosDisponibles;
	private JLabel etiquetaMochilasDisponibles;
	private JLabel etiquetaArconesDisponibles;
	
	// Etiquetas del panel de introducci�n de datos
	private JLabel etiquetaIntroduccionNumeroPersonas;
	private JLabel etiquetaIntroduccionPeso;
	private JLabel etiquetaIntroduccionExpedicionPeligrosa;
	
	// Etiquetas del panel de material de expedici�n
	private JLabel etiquetaCapitan;
	private JLabel etiquetaOperarios;
	private JLabel etiquetaArmas;
	private JLabel etiquetaCajas;
	private JLabel etiquetaVehiculos;
	private JLabel etiquetaMochilas;
	private JLabel etiquetaArcones;
	
	// Cajas de texto del panel de material de expedici�n
	private JTextArea suboficialesTextArea;
	private JTextArea guardiasTextArea;
	
	// Cajas de texto con scroll del material de expedici�n
	private JScrollPane suboficialesScrollPane;
	private JScrollPane guardiasScrollPane;
	
	// Campos del panel de introducci�n de datos
	private JTextField introduccionNumeroPersonasTextField;
	private JTextField introduccionPesoTextField;
	private JCheckBox introduccionExpedicionPeligrosaCheckBox;
	
	// Bot�n de creaci�n de expedici�n
	private JButton botonCreacionExpedicion;
	
	// Bot�n de volcado a fichero
	private JButton botonVolcadoAFichero;
	
	// Expedici�n
	Expedicion expedicion;
	
	/* Constructores */
	public InterfazGrafica(Expedicion expedicion){
		
		this.expedicion = expedicion;
		
		// CREACI�N DE PANELES DE LA VENTANA PRINCIPAL
		
		// Creaci�n de la ventana principal
		setSize(1000, 800);
		setTitle("Programa de Expediciones");
		setLayout(new BorderLayout());
		
		etiquetaTituloVentana = new JLabel("PROGRAMA DE GESTI�N DE RECURSOS PARA EXPEDICIONES", SwingConstants.CENTER);
		etiquetaTituloVentana.setForeground(Color.red);
		add(etiquetaTituloVentana, BorderLayout.NORTH);
		
		
		
		// CREACI�N DE LOS PANELES DE LA VENTANA PRINCIPAL
		
		
		
		// Creaci�n del panel de material disponible
		materialDisponibleContentPane = new Container();
		materialDisponibleContentPane.setLayout(new GridLayout(9, 1));
		add(materialDisponibleContentPane, BorderLayout.WEST);
		
		etiquetaTituloPanelMaterialDisponible = new JLabel("MATERIAL DISPONIBLE");
		etiquetaTituloPanelMaterialDisponible.setForeground(Color.blue);
		materialDisponibleContentPane.add(etiquetaTituloPanelMaterialDisponible);
		
		// Creaci�n del panel de introducci�n de datos
		introduccionDatosContentPane = new Container();
		introduccionDatosContentPane.setLayout(new FlowLayout());
		add(introduccionDatosContentPane, BorderLayout.CENTER);
		
		// Creaci�n del panel del material para la expedici�n
		materialExpedicionContentPane = new Container();
		materialExpedicionContentPane.setLayout(new GridLayout(10, 1));
		add(materialExpedicionContentPane, BorderLayout.EAST);
		
		etiquetaTituloPanelMaterialExpedicion = new JLabel("MATERIAL PARA EXPEDICI�N");
		etiquetaTituloPanelMaterialExpedicion.setForeground(Color.blue);
		etiquetaTituloPanelMaterialExpedicion.setVisible(false);
		materialExpedicionContentPane.add(etiquetaTituloPanelMaterialExpedicion);
		
		// Creaci�n del panel de volcado a fichero
		volcarFicheroContentPane = new Container();
		volcarFicheroContentPane.setLayout(new FlowLayout());
		add(volcarFicheroContentPane, BorderLayout.SOUTH);
		
		
		
		// CREACI�N DE LAS ETIQUETAS DEL PANEL DE MATERIAL DISPONIBLE
		
		
		
		// Creaci�n de la etiqueta de oficiales disponibles en el panel de material disponible
		etiquetaOficialesDisponibles = new JLabel("Oficiales Disponibles: " + Oficial.getContOficiales());
		materialDisponibleContentPane.add(etiquetaOficialesDisponibles);
		
		// Creaci�n de la etiqueta de guardias disponibles en el panel de material disponible
		etiquetaGuardiasDisponibles = new JLabel("Guardias Disponibles: " + Guardia.getcontGuardias());
		materialDisponibleContentPane.add(etiquetaGuardiasDisponibles);
		
		// Creaci�n de la etiqueta de operarios disponibles en el panel de material disponible
		etiquetaOperariosDisponibles = new JLabel("Operarios Disponibles: " + expedicion.getOperariosDisponibles());
		materialDisponibleContentPane.add(etiquetaOperariosDisponibles);
		
		// Creaci�n de la etiqueta de armas disponibles en el panel de material disponible
		etiquetaArmasDisponibles = new JLabel("Armas Disponibles: " + expedicion.getArmasDisponibles());
		materialDisponibleContentPane.add(etiquetaArmasDisponibles);
		
		// Creaci�n de la etiqueta de cajas disponibles en el panel de material disponible
		etiquetaCajasDisponibles = new JLabel("Cajas Disponibles: " + expedicion.getCajasDisponibles());
		materialDisponibleContentPane.add(etiquetaCajasDisponibles);
		
		// Creaci�n de la etiqueta de veh�culos disponibles en el panel de material disponible
		etiquetaVehiculosDisponibles = new JLabel("Veh�culos Disponibles: " + expedicion.getVehiculosDisponibles());
		materialDisponibleContentPane.add(etiquetaVehiculosDisponibles);
		
		// Creaci�n de la etiqueta de mochilas disponible en el panel de material disponible
		etiquetaMochilasDisponibles = new JLabel("Mochilas Disponibles: " + expedicion.getMochilasDisponibles());
		materialDisponibleContentPane.add(etiquetaMochilasDisponibles);
		
		// Creaci�n de la etiqueta de arcones disponibles en el panel de material disponible
		etiquetaArconesDisponibles = new JLabel("Arcones Disponibles: " + expedicion.getArconesDisponibles());
		materialDisponibleContentPane.add(etiquetaArconesDisponibles);
		
		
		
		// CREACI�N DE LOS PANELES DEL PANEL DE INTRODUCCI�N DE DATOS
		
		
		
		// Creaci�n del panel de introducci�n del n�mero de personas en el panel de introducci�n de datos
		introduccionNumeroPersonasContentPane = new Container();
		introduccionNumeroPersonasContentPane.setLayout(new GridLayout(2, 1));
		introduccionDatosContentPane.add(introduccionNumeroPersonasContentPane);
		
		// Creaci�n del panel de introducci�n del peso en el panel de introducci�n de datos
		introduccionPesoContentPane = new Container();
		introduccionPesoContentPane.setLayout(new GridLayout(2, 1));
		introduccionDatosContentPane.add(introduccionPesoContentPane);
		
		// Creaci�n del panel de introducci�n de expedici�n peligrosa en el panel de introducci�n de datos
		introduccionExpedicionPeligrosaContentPane = new Container();
		introduccionExpedicionPeligrosaContentPane.setLayout(new GridLayout(2, 1));
		introduccionDatosContentPane.add(introduccionExpedicionPeligrosaContentPane);
		
		
		
		// CREACI�N DE LAS ETIQUETAS DEL PANEL DE INTRODUCCI�N DE DATOS
		
		
		
		// Creaci�n de la etiqueta de introducci�n del n�mero de personas en el panel de introducci�n de datos
		etiquetaIntroduccionNumeroPersonas = new JLabel("N� Miembros: ");
		introduccionNumeroPersonasContentPane.add(etiquetaIntroduccionNumeroPersonas);
		
		// Creaci�n de la etiqueta de introducci�n del peso en el panel de introducci�n de datos
		etiquetaIntroduccionPeso = new JLabel("Peso (Kg): ");
		introduccionPesoContentPane.add(etiquetaIntroduccionPeso);
		
		// Creaci�n de la etiqueta de introducci�n de expedici�n peligrosa en el panel de introducci�n de datos
		etiquetaIntroduccionExpedicionPeligrosa = new JLabel("Expedici�n Peligrosa:");
		introduccionExpedicionPeligrosaContentPane.add(etiquetaIntroduccionExpedicionPeligrosa);
		
		
		
		// CREACI�N DE LOS CAMPOS DEL PANEL DE INTRODUCCI�N DE DATOS
		
		
		
		// Creaci�n del campo de introducci�n del n�mero de personas en el panel de introducci�n de datos
		introduccionNumeroPersonasTextField = new JTextField();
		introduccionNumeroPersonasTextField.setColumns(NUMERO_MAX_COLUMNAS_TEXT_FIELD);
		introduccionNumeroPersonasContentPane.add(introduccionNumeroPersonasTextField);
		
		// Creaci�n del campo de introducci�n de peso en el panel de introducci�n de datos
		introduccionPesoTextField = new JTextField();
		introduccionPesoTextField.setColumns(NUMERO_MAX_COLUMNAS_TEXT_FIELD);
		introduccionPesoContentPane.add(introduccionPesoTextField);
		
		// Creaci�n del campo de introducci�n de expedici�n peligrosa en el panel de introducci�n de datos
		introduccionExpedicionPeligrosaCheckBox = new JCheckBox();
		introduccionExpedicionPeligrosaContentPane.add(introduccionExpedicionPeligrosaCheckBox);
		
		
		
		// CREACI�N DEL BOT�N DE CREACI�N DE EXPEDICI�N
		botonCreacionExpedicion = new JButton("Crear Expedici�n");
		botonCreacionExpedicion.addActionListener(this);
		introduccionDatosContentPane.add(botonCreacionExpedicion);
		
		
		
		// CREACI�N DE LAS ETIQUETAS DEL MATERIAL DE LA EXPEDICI�N
		
		
		
		// Creaci�n de la etiqueta del capit�n de la expedici�n
		etiquetaCapitan = new JLabel("Capit�n: ");
		etiquetaCapitan.setVisible(false);
		materialExpedicionContentPane.add(etiquetaCapitan);
		
		// Creaci�n del area de texto scroll de suboficiales
		suboficialesTextArea = new JTextArea();
		suboficialesTextArea.setColumns(NUMERO_MAX_COLUMNAS_TEXT_AREA);
		suboficialesTextArea.setRows(NUMERO_MAX_FILAS_TEXT_AREA);
		suboficialesTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		suboficialesTextArea.setEditable(false);
		suboficialesTextArea.append("SUBOFICIALES:\n");
		
		suboficialesScrollPane = new JScrollPane(suboficialesTextArea);
		suboficialesScrollPane.setVisible(false);
		materialExpedicionContentPane.add(suboficialesScrollPane);
		
		// Creaci�n del area de texto scroll de guardias
		guardiasTextArea = new JTextArea();
		guardiasTextArea.setColumns(NUMERO_MAX_COLUMNAS_TEXT_AREA);
		guardiasTextArea.setRows(NUMERO_MAX_FILAS_TEXT_AREA);
		guardiasTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		guardiasTextArea.setEditable(false);
		guardiasTextArea.append("GUARDIAS:\n");
		
		guardiasScrollPane = new JScrollPane(guardiasTextArea);
		guardiasScrollPane.setVisible(false);
		materialExpedicionContentPane.add(guardiasScrollPane);
		
		// Creaci�n de la etiqueta de operarios de la expedici�n
		etiquetaOperarios = new JLabel("Operarios: ");
		etiquetaOperarios.setVisible(false);
		materialExpedicionContentPane.add(etiquetaOperarios);
		
		// Creaci�n de la etiqueta de armas de la expedici�n
		etiquetaArmas = new JLabel("Armas: ");
		etiquetaArmas.setVisible(false);
		materialExpedicionContentPane.add(etiquetaArmas);
		
		// Creaci�n de la etiqueta de cajas de la expedici�n
		etiquetaCajas = new JLabel("Cajas: ");
		etiquetaCajas.setVisible(false);
		materialExpedicionContentPane.add(etiquetaCajas);
		
		// Creaci�n de la etiqueta de veh�culos de la expedici�n
		etiquetaVehiculos = new JLabel("Veh�culos: ");
		etiquetaVehiculos.setVisible(false);
		materialExpedicionContentPane.add(etiquetaVehiculos);
		
		// Creaci�n de la etiqueta de mochilas de la expedici�n
		etiquetaMochilas = new JLabel("Mochilas: ");
		etiquetaMochilas.setVisible(false);
		materialExpedicionContentPane.add(etiquetaMochilas);
		
		// Creaci�n de la etiqueta de arcones de la expedici�n
		etiquetaArcones = new JLabel("Arcones: ");
		etiquetaArcones.setVisible(false);
		materialExpedicionContentPane.add(etiquetaArcones);
		
		
		
		// CREACI�N DEL BOT�N DE VOLCADO A FICHERO
		botonVolcadoAFichero = new JButton("Volcar a fichero");
		botonVolcadoAFichero.addActionListener(this);
		botonVolcadoAFichero.setVisible(false);
		volcarFicheroContentPane.add(botonVolcadoAFichero);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		JButton botonPulsado = (JButton)evento.getSource();
		
		// Comprobamos si el bot�n pulsado es el de crear expedici�n o el de volcar a fichero
		if(botonPulsado.getText().equals(botonCreacionExpedicion.getText())) {
			
			// Recogemos los valores de los campos de input
			String inputNumeroPersonas = introduccionNumeroPersonasTextField.getText();
			String inputPeso = introduccionPesoTextField.getText();
			boolean expedicionPeligrosa = introduccionExpedicionPeligrosaCheckBox.isSelected();
			
			// Comprobamos que no haya errores, en caso de haberlos mostramos error, en caso contrario calculamos la expedici�n
			try {
				
				if(inputNumeroPersonas.length() <= 0)
					throw new ErroresIntroducidosException("ERROR: No se ha introducido ning�n valor en el campo de texto del n�mero de personas.");
				
				if(inputPeso.length() <= 0)
					throw new ErroresIntroducidosException("ERROR: No se ha introducido ning�n valor en el campo de texto del peso.");
				
				for(int i = 0; i < inputNumeroPersonas.length(); i++)
					if(inputNumeroPersonas.charAt(i) < '0' || inputNumeroPersonas.charAt(i) > '9')
						throw new ErroresIntroducidosException("ERROR: Se han introducido valores no num�ricos en el campo de texto del n�mero de personas.");
				
				for(int i = 0; i < inputPeso.length(); i++)
					if(inputPeso.charAt(i) < '0' || inputPeso.charAt(i) > '9')
						throw new ErroresIntroducidosException("ERROR: Se han introducido valores no num�ricos en el campo de texto del peso.");
				
				// Mandamos los datos al calculador de expediciones
				expedicion.setNumPersonas(Integer.parseInt(inputNumeroPersonas));
				expedicion.setCantidadPeso(Integer.parseInt(inputPeso));
				expedicion.setExpedicionPeligrosa(expedicionPeligrosa);
				
				try {
					
					// Ocultamos todos los datos de la expedici�n
					etiquetaCapitan.setVisible(false);
					suboficialesScrollPane.setVisible(false);
					guardiasScrollPane.setVisible(false);
					etiquetaOperarios.setVisible(false);
					etiquetaArmas.setVisible(false);
					etiquetaVehiculos.setVisible(false);
					etiquetaMochilas.setVisible(false);
					etiquetaArcones.setVisible(false);
					etiquetaCajas.setVisible(false);
					
					// Ocultamos el bot�n de volcado a fichero
					botonVolcadoAFichero.setVisible(false);
					
					expedicion.calculaExpedicion();
					
					// Actualizamos la informaci�n de la interfaz gr�fica
					// Capit�n
					etiquetaCapitan.setText("Capit�n: " + expedicion.getCapitanExpedicion().getNombre());
					etiquetaCapitan.setVisible(true);
					
					// SubOficiales
					suboficialesTextArea.setText("SUBOFICIALES:\n");
					for(int i = 0; i < expedicion.getSubOficialesExpedicion().size(); i++)
						suboficialesTextArea.append(expedicion.getSubOficialesExpedicion().get(i).getNombre() + "\n");
					suboficialesScrollPane.setVisible(true);
					
					// Guardias
					guardiasTextArea.setText("GUARDIAS:\n");
					for(int i = 0; i < expedicion.getGuardiasExpedicion().size(); i++)
						guardiasTextArea.append(expedicion.getGuardiasExpedicion().get(i).getNombre() + "\n");
					guardiasScrollPane.setVisible(true);
					
					// Operarios
					etiquetaOperarios.setText("Operarios: " + expedicion.getOperariosExpedicion());
					etiquetaOperarios.setVisible(true);
					
					// Armas
					etiquetaArmas.setText("Armas: " + expedicion.getArmasExpedicion());
					etiquetaArmas.setVisible(true);
					
					// Cajas
					etiquetaCajas.setText("Cajas: " + expedicion.getCajasExpedicion());
					etiquetaCajas.setVisible(true);
					
					// Veh�culos
					etiquetaVehiculos.setText("Veh�culos: " + expedicion.getVehiculosExpedicion());
					etiquetaVehiculos.setVisible(true);
					
					// Mochilas
					etiquetaMochilas.setText("Mochilas: " + expedicion.getMochilasExpedicion());
					etiquetaMochilas.setVisible(true);
					
					// Arcones
					etiquetaArcones.setText("Arcones: " + expedicion.getArconesExpedicion());
					etiquetaArcones.setVisible(true);
					
					// Mostramos el bot�n de volcado a fichero
					botonVolcadoAFichero.setVisible(true);
					
				}
				catch(RecursosInsuficientesException e) {
					muestraError(e.getMessage());
				}
				
			}
			catch(ErroresIntroducidosException e) {
				
				System.out.println(e.getMessage());
				muestraError(e.getMessage());
				
			}
			
		}
		else {
			System.out.println("Se ha pulsado el bot�n de volcado a fichero.");
			// VOLCAR EL CONTENIDO DE LA EXPEDICI�N A FICHERO ->
		}
		
	}
	
	public void muestraError(String msgError) {
		
		JPanel panel = new JPanel();
		JOptionPane.showMessageDialog(panel, msgError , "Error", JOptionPane.ERROR_MESSAGE);
		
	}
	
}