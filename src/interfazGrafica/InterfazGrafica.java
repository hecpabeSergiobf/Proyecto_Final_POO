

/*
 * 	Título: Interfaz Gráfica
 * 	Nombre: Héctor Paredes Benavides
 * 	Descripción: Creamos una interfaz gráfica para el programa de expediciones
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
	
	// Paneles del panel de introducción de datos
	private Container introduccionNumeroPersonasContentPane;
	private Container introduccionPesoContentPane;
	private Container introduccionExpedicionPeligrosaContentPane;
	
	// Etiqueta título de ventanas y paneles
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
	
	// Etiquetas del panel de introducción de datos
	private JLabel etiquetaIntroduccionNumeroPersonas;
	private JLabel etiquetaIntroduccionPeso;
	private JLabel etiquetaIntroduccionExpedicionPeligrosa;
	
	// Etiquetas del panel de material de expedición
	private JLabel etiquetaCapitan;
	private JLabel etiquetaOperarios;
	private JLabel etiquetaArmas;
	private JLabel etiquetaCajas;
	private JLabel etiquetaVehiculos;
	private JLabel etiquetaMochilas;
	private JLabel etiquetaArcones;
	
	// Cajas de texto del panel de material de expedición
	private JTextArea suboficialesTextArea;
	private JTextArea guardiasTextArea;
	
	// Cajas de texto con scroll del material de expedición
	private JScrollPane suboficialesScrollPane;
	private JScrollPane guardiasScrollPane;
	
	// Campos del panel de introducción de datos
	private JTextField introduccionNumeroPersonasTextField;
	private JTextField introduccionPesoTextField;
	private JCheckBox introduccionExpedicionPeligrosaCheckBox;
	
	// Botón de creación de expedición
	private JButton botonCreacionExpedicion;
	
	// Botón de volcado a fichero
	private JButton botonVolcadoAFichero;
	
	// Expedición
	Expedicion expedicion;
	
	/* Constructores */
	public InterfazGrafica(Expedicion expedicion){
		
		this.expedicion = expedicion;
		
		// CREACIÓN DE PANELES DE LA VENTANA PRINCIPAL
		
		// Creación de la ventana principal
		setSize(1000, 800);
		setTitle("Programa de Expediciones");
		setLayout(new BorderLayout());
		
		etiquetaTituloVentana = new JLabel("PROGRAMA DE GESTIÓN DE RECURSOS PARA EXPEDICIONES", SwingConstants.CENTER);
		etiquetaTituloVentana.setForeground(Color.red);
		add(etiquetaTituloVentana, BorderLayout.NORTH);
		
		
		
		// CREACIÓN DE LOS PANELES DE LA VENTANA PRINCIPAL
		
		
		
		// Creación del panel de material disponible
		materialDisponibleContentPane = new Container();
		materialDisponibleContentPane.setLayout(new GridLayout(9, 1));
		add(materialDisponibleContentPane, BorderLayout.WEST);
		
		etiquetaTituloPanelMaterialDisponible = new JLabel("MATERIAL DISPONIBLE");
		etiquetaTituloPanelMaterialDisponible.setForeground(Color.blue);
		materialDisponibleContentPane.add(etiquetaTituloPanelMaterialDisponible);
		
		// Creación del panel de introducción de datos
		introduccionDatosContentPane = new Container();
		introduccionDatosContentPane.setLayout(new FlowLayout());
		add(introduccionDatosContentPane, BorderLayout.CENTER);
		
		// Creación del panel del material para la expedición
		materialExpedicionContentPane = new Container();
		materialExpedicionContentPane.setLayout(new GridLayout(10, 1));
		add(materialExpedicionContentPane, BorderLayout.EAST);
		
		etiquetaTituloPanelMaterialExpedicion = new JLabel("MATERIAL PARA EXPEDICIÓN");
		etiquetaTituloPanelMaterialExpedicion.setForeground(Color.blue);
		etiquetaTituloPanelMaterialExpedicion.setVisible(false);
		materialExpedicionContentPane.add(etiquetaTituloPanelMaterialExpedicion);
		
		// Creación del panel de volcado a fichero
		volcarFicheroContentPane = new Container();
		volcarFicheroContentPane.setLayout(new FlowLayout());
		add(volcarFicheroContentPane, BorderLayout.SOUTH);
		
		
		
		// CREACIÓN DE LAS ETIQUETAS DEL PANEL DE MATERIAL DISPONIBLE
		
		
		
		// Creación de la etiqueta de oficiales disponibles en el panel de material disponible
		etiquetaOficialesDisponibles = new JLabel("Oficiales Disponibles: " + Oficial.getContOficiales());
		materialDisponibleContentPane.add(etiquetaOficialesDisponibles);
		
		// Creación de la etiqueta de guardias disponibles en el panel de material disponible
		etiquetaGuardiasDisponibles = new JLabel("Guardias Disponibles: " + Guardia.getcontGuardias());
		materialDisponibleContentPane.add(etiquetaGuardiasDisponibles);
		
		// Creación de la etiqueta de operarios disponibles en el panel de material disponible
		etiquetaOperariosDisponibles = new JLabel("Operarios Disponibles: " + expedicion.getOperariosDisponibles());
		materialDisponibleContentPane.add(etiquetaOperariosDisponibles);
		
		// Creación de la etiqueta de armas disponibles en el panel de material disponible
		etiquetaArmasDisponibles = new JLabel("Armas Disponibles: " + expedicion.getArmasDisponibles());
		materialDisponibleContentPane.add(etiquetaArmasDisponibles);
		
		// Creación de la etiqueta de cajas disponibles en el panel de material disponible
		etiquetaCajasDisponibles = new JLabel("Cajas Disponibles: " + expedicion.getCajasDisponibles());
		materialDisponibleContentPane.add(etiquetaCajasDisponibles);
		
		// Creación de la etiqueta de vehículos disponibles en el panel de material disponible
		etiquetaVehiculosDisponibles = new JLabel("Vehículos Disponibles: " + expedicion.getVehiculosDisponibles());
		materialDisponibleContentPane.add(etiquetaVehiculosDisponibles);
		
		// Creación de la etiqueta de mochilas disponible en el panel de material disponible
		etiquetaMochilasDisponibles = new JLabel("Mochilas Disponibles: " + expedicion.getMochilasDisponibles());
		materialDisponibleContentPane.add(etiquetaMochilasDisponibles);
		
		// Creación de la etiqueta de arcones disponibles en el panel de material disponible
		etiquetaArconesDisponibles = new JLabel("Arcones Disponibles: " + expedicion.getArconesDisponibles());
		materialDisponibleContentPane.add(etiquetaArconesDisponibles);
		
		
		
		// CREACIÓN DE LOS PANELES DEL PANEL DE INTRODUCCIÓN DE DATOS
		
		
		
		// Creación del panel de introducción del número de personas en el panel de introducción de datos
		introduccionNumeroPersonasContentPane = new Container();
		introduccionNumeroPersonasContentPane.setLayout(new GridLayout(2, 1));
		introduccionDatosContentPane.add(introduccionNumeroPersonasContentPane);
		
		// Creación del panel de introducción del peso en el panel de introducción de datos
		introduccionPesoContentPane = new Container();
		introduccionPesoContentPane.setLayout(new GridLayout(2, 1));
		introduccionDatosContentPane.add(introduccionPesoContentPane);
		
		// Creación del panel de introducción de expedición peligrosa en el panel de introducción de datos
		introduccionExpedicionPeligrosaContentPane = new Container();
		introduccionExpedicionPeligrosaContentPane.setLayout(new GridLayout(2, 1));
		introduccionDatosContentPane.add(introduccionExpedicionPeligrosaContentPane);
		
		
		
		// CREACIÓN DE LAS ETIQUETAS DEL PANEL DE INTRODUCCIÓN DE DATOS
		
		
		
		// Creación de la etiqueta de introducción del número de personas en el panel de introducción de datos
		etiquetaIntroduccionNumeroPersonas = new JLabel("Nº Miembros: ");
		introduccionNumeroPersonasContentPane.add(etiquetaIntroduccionNumeroPersonas);
		
		// Creación de la etiqueta de introducción del peso en el panel de introducción de datos
		etiquetaIntroduccionPeso = new JLabel("Peso (Kg): ");
		introduccionPesoContentPane.add(etiquetaIntroduccionPeso);
		
		// Creación de la etiqueta de introducción de expedición peligrosa en el panel de introducción de datos
		etiquetaIntroduccionExpedicionPeligrosa = new JLabel("Expedición Peligrosa:");
		introduccionExpedicionPeligrosaContentPane.add(etiquetaIntroduccionExpedicionPeligrosa);
		
		
		
		// CREACIÓN DE LOS CAMPOS DEL PANEL DE INTRODUCCIÓN DE DATOS
		
		
		
		// Creación del campo de introducción del número de personas en el panel de introducción de datos
		introduccionNumeroPersonasTextField = new JTextField();
		introduccionNumeroPersonasTextField.setColumns(NUMERO_MAX_COLUMNAS_TEXT_FIELD);
		introduccionNumeroPersonasContentPane.add(introduccionNumeroPersonasTextField);
		
		// Creación del campo de introducción de peso en el panel de introducción de datos
		introduccionPesoTextField = new JTextField();
		introduccionPesoTextField.setColumns(NUMERO_MAX_COLUMNAS_TEXT_FIELD);
		introduccionPesoContentPane.add(introduccionPesoTextField);
		
		// Creación del campo de introducción de expedición peligrosa en el panel de introducción de datos
		introduccionExpedicionPeligrosaCheckBox = new JCheckBox();
		introduccionExpedicionPeligrosaContentPane.add(introduccionExpedicionPeligrosaCheckBox);
		
		
		
		// CREACIÓN DEL BOTÓN DE CREACIÓN DE EXPEDICIÓN
		botonCreacionExpedicion = new JButton("Crear Expedición");
		botonCreacionExpedicion.addActionListener(this);
		introduccionDatosContentPane.add(botonCreacionExpedicion);
		
		
		
		// CREACIÓN DE LAS ETIQUETAS DEL MATERIAL DE LA EXPEDICIÓN
		
		
		
		// Creación de la etiqueta del capitán de la expedición
		etiquetaCapitan = new JLabel("Capitán: ");
		etiquetaCapitan.setVisible(false);
		materialExpedicionContentPane.add(etiquetaCapitan);
		
		// Creación del area de texto scroll de suboficiales
		suboficialesTextArea = new JTextArea();
		suboficialesTextArea.setColumns(NUMERO_MAX_COLUMNAS_TEXT_AREA);
		suboficialesTextArea.setRows(NUMERO_MAX_FILAS_TEXT_AREA);
		suboficialesTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		suboficialesTextArea.setEditable(false);
		suboficialesTextArea.append("SUBOFICIALES:\n");
		
		suboficialesScrollPane = new JScrollPane(suboficialesTextArea);
		suboficialesScrollPane.setVisible(false);
		materialExpedicionContentPane.add(suboficialesScrollPane);
		
		// Creación del area de texto scroll de guardias
		guardiasTextArea = new JTextArea();
		guardiasTextArea.setColumns(NUMERO_MAX_COLUMNAS_TEXT_AREA);
		guardiasTextArea.setRows(NUMERO_MAX_FILAS_TEXT_AREA);
		guardiasTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		guardiasTextArea.setEditable(false);
		guardiasTextArea.append("GUARDIAS:\n");
		
		guardiasScrollPane = new JScrollPane(guardiasTextArea);
		guardiasScrollPane.setVisible(false);
		materialExpedicionContentPane.add(guardiasScrollPane);
		
		// Creación de la etiqueta de operarios de la expedición
		etiquetaOperarios = new JLabel("Operarios: ");
		etiquetaOperarios.setVisible(false);
		materialExpedicionContentPane.add(etiquetaOperarios);
		
		// Creación de la etiqueta de armas de la expedición
		etiquetaArmas = new JLabel("Armas: ");
		etiquetaArmas.setVisible(false);
		materialExpedicionContentPane.add(etiquetaArmas);
		
		// Creación de la etiqueta de cajas de la expedición
		etiquetaCajas = new JLabel("Cajas: ");
		etiquetaCajas.setVisible(false);
		materialExpedicionContentPane.add(etiquetaCajas);
		
		// Creación de la etiqueta de vehículos de la expedición
		etiquetaVehiculos = new JLabel("Vehículos: ");
		etiquetaVehiculos.setVisible(false);
		materialExpedicionContentPane.add(etiquetaVehiculos);
		
		// Creación de la etiqueta de mochilas de la expedición
		etiquetaMochilas = new JLabel("Mochilas: ");
		etiquetaMochilas.setVisible(false);
		materialExpedicionContentPane.add(etiquetaMochilas);
		
		// Creación de la etiqueta de arcones de la expedición
		etiquetaArcones = new JLabel("Arcones: ");
		etiquetaArcones.setVisible(false);
		materialExpedicionContentPane.add(etiquetaArcones);
		
		
		
		// CREACIÓN DEL BOTÓN DE VOLCADO A FICHERO
		botonVolcadoAFichero = new JButton("Volcar a fichero");
		botonVolcadoAFichero.addActionListener(this);
		botonVolcadoAFichero.setVisible(false);
		volcarFicheroContentPane.add(botonVolcadoAFichero);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		JButton botonPulsado = (JButton)evento.getSource();
		
		// Comprobamos si el botón pulsado es el de crear expedición o el de volcar a fichero
		if(botonPulsado.getText().equals(botonCreacionExpedicion.getText())) {
			
			// Recogemos los valores de los campos de input
			String inputNumeroPersonas = introduccionNumeroPersonasTextField.getText();
			String inputPeso = introduccionPesoTextField.getText();
			boolean expedicionPeligrosa = introduccionExpedicionPeligrosaCheckBox.isSelected();
			
			// Comprobamos que no haya errores, en caso de haberlos mostramos error, en caso contrario calculamos la expedición
			try {
				
				if(inputNumeroPersonas.length() <= 0)
					throw new ErroresIntroducidosException("ERROR: No se ha introducido ningún valor en el campo de texto del número de personas.");
				
				if(inputPeso.length() <= 0)
					throw new ErroresIntroducidosException("ERROR: No se ha introducido ningún valor en el campo de texto del peso.");
				
				for(int i = 0; i < inputNumeroPersonas.length(); i++)
					if(inputNumeroPersonas.charAt(i) < '0' || inputNumeroPersonas.charAt(i) > '9')
						throw new ErroresIntroducidosException("ERROR: Se han introducido valores no numéricos en el campo de texto del número de personas.");
				
				for(int i = 0; i < inputPeso.length(); i++)
					if(inputPeso.charAt(i) < '0' || inputPeso.charAt(i) > '9')
						throw new ErroresIntroducidosException("ERROR: Se han introducido valores no numéricos en el campo de texto del peso.");
				
				// Mandamos los datos al calculador de expediciones
				expedicion.setNumPersonas(Integer.parseInt(inputNumeroPersonas));
				expedicion.setCantidadPeso(Integer.parseInt(inputPeso));
				expedicion.setExpedicionPeligrosa(expedicionPeligrosa);
				
				try {
					
					// Ocultamos todos los datos de la expedición
					etiquetaCapitan.setVisible(false);
					suboficialesScrollPane.setVisible(false);
					guardiasScrollPane.setVisible(false);
					etiquetaOperarios.setVisible(false);
					etiquetaArmas.setVisible(false);
					etiquetaVehiculos.setVisible(false);
					etiquetaMochilas.setVisible(false);
					etiquetaArcones.setVisible(false);
					etiquetaCajas.setVisible(false);
					
					// Ocultamos el botón de volcado a fichero
					botonVolcadoAFichero.setVisible(false);
					
					expedicion.calculaExpedicion();
					
					// Actualizamos la información de la interfaz gráfica
					// Capitán
					etiquetaCapitan.setText("Capitán: " + expedicion.getCapitanExpedicion().getNombre());
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
					
					// Vehículos
					etiquetaVehiculos.setText("Vehículos: " + expedicion.getVehiculosExpedicion());
					etiquetaVehiculos.setVisible(true);
					
					// Mochilas
					etiquetaMochilas.setText("Mochilas: " + expedicion.getMochilasExpedicion());
					etiquetaMochilas.setVisible(true);
					
					// Arcones
					etiquetaArcones.setText("Arcones: " + expedicion.getArconesExpedicion());
					etiquetaArcones.setVisible(true);
					
					// Mostramos el botón de volcado a fichero
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
			System.out.println("Se ha pulsado el botón de volcado a fichero.");
			// VOLCAR EL CONTENIDO DE LA EXPEDICIÓN A FICHERO ->
		}
		
	}
	
	public void muestraError(String msgError) {
		
		JPanel panel = new JPanel();
		JOptionPane.showMessageDialog(panel, msgError , "Error", JOptionPane.ERROR_MESSAGE);
		
	}
	
}