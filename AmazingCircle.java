


			// Circle filled with Gradient
			
			
			import java.awt.*;
			import javax.swing.*;
			
			
			
			public class AmazingCircle extends JPanel{
			
			
			JFrame frame;
			
			
			@Override
			public void paintComponent(Graphics gg){
				
				super.paintComponent(gg);
				Graphics2D g = (Graphics2D) gg;
				
				GradientPaint paint = new GradientPaint( 0,0, Color.YELLOW ,40,40, Color.RED,true );
				Font largeFont = new Font("Gtek Technology",Font.PLAIN,70);
				
				BasicStroke bs = new BasicStroke(10);
				
			
				
				g.setPaint(paint);
				g.setFont(largeFont);
				g.drawOval(0,0,400,400);
				
				setBackground(Color.BLACK);
				
				
				float[] dashPattern = { 10, 50, 100, 200 };    
				g.setStroke(new BasicStroke(81, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER, 10,dashPattern, 0));
				
				
				g.drawOval(0,0,800,400);
				
				g.setPaint( new GradientPaint( 0,0, Color.GREEN ,10,10, new Color(132,187,251) ,true ) );
				g.drawString( "tinsae",70,250 );
				
				
			}
			
			
			
			public AmazingCircle(){
				
				frame = new JFrame("Amazing Circle");
				
				
				frame.add(this);
				frame.setSize(500,500);
				frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				frame.setVisible(true);
				
			}
			
			
			public static void main(String[] args){
			
			
			new AmazingCircle();
			
			}
			
			
			}