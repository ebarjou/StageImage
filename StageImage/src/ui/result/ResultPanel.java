package ui.result;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import algorithm.MatchlistToPoint3D;
import lang.Text;
import ui.calibration.CalibrationPanel;
import ui.result.event.EventChangeSpin;
import ui.result.event.EventChangeView;
import ui.result.event.EventComputeResult;
import ui.result.event.EventExport;
import uiElements.Button;
import uiElements.Panel;
import uiElements.Slider;
import uiElements.TextLine;
import uiElements.combinedElement.PointCloudFrame;
import utils.MatchList;
/*
 * Panneau pour afficher le résultat, comprend une barre de controle et un pointCloudFrame qui affiche un nuage de point
 */
public class ResultPanel extends Panel{
	private PointCloudFrame		pointCloudFrame;
	private ControlFrame		controlFrame;
	private List<MatchList>		matchLists;
	
	public ResultPanel(CalibrationPanel	calibrationPanel){
		super(new BorderLayout());
		
		matchLists = new ArrayList<MatchList>();
		
		pointCloudFrame = new PointCloudFrame();
		controlFrame = new ControlFrame();
		
		this.add(controlFrame, BorderLayout.NORTH);
		this.add(pointCloudFrame, BorderLayout.CENTER);
		
		
	}
	
	public PointCloudFrame getPointCloudFrame(){
		return this.pointCloudFrame;
	}
	
	/*
	 * Appelée après le SIFT, cette méthode convertie la liste de MatchList en liste de Point3D et les envoie au pointCloudFrame pour qu'il les affiches
	 */
	public void ComputePoints(){
		//points = matchLists.get(0).to3DPoints(this.getWidth()/2, calibrationPanel); /*TODO Verifier qu'il existe ? */
		//for (int i = 1; i < matchLists.size(); ++i) points.addAll(matchLists.get(i).to3DPoints(this.getWidth()/2, calibrationPanel));
		pointCloudFrame.setPoints3D(MatchlistToPoint3D.convert( matchLists.get(0)));
	}
	
	/*
	 * Panneau de controle
	 */
	private class ControlFrame extends Panel{
		private Button				startComputingButton;
		private Button				saveResult;
		private ScaleControlFrame	scaleControlFrame;
		private SpinControlFrame	spinControlFrame;
		private MoveControlFrame	moveControlFrame;
		
		public ControlFrame(){
			super(new FlowLayout(FlowLayout.LEFT));
			
			startComputingButton = new Button(""+Text.BT_COMPUTE, new EventComputeResult(matchLists, ResultPanel.this));
			saveResult = new Button("Export", new EventExport(ResultPanel.this));
			scaleControlFrame = new ScaleControlFrame();
			spinControlFrame = new SpinControlFrame();
			moveControlFrame = new MoveControlFrame();
			
			this.add(startComputingButton);
			this.add(scaleControlFrame);
			this.add(spinControlFrame);
			this.add(moveControlFrame);
			this.add(saveResult);
		}
		/*
		 * Panneau pour modifier l'échelle
		 */
		private class ScaleControlFrame extends Panel{
			private Button	scaleP;
			private Button	scaleL;
			
			public ScaleControlFrame(){
				super();
				scaleP = new Button("+", new EventChangeView(ResultPanel.this, EventChangeView.action.SCALE, EventChangeView.dir.PLUS));
				scaleL = new Button("-", new EventChangeView(ResultPanel.this, EventChangeView.action.SCALE, EventChangeView.dir.LESS));
				this.add(new TextLine("Scale : "));
				this.add(scaleP);
				this.add(scaleL);
			}
			
		}
		/*
		 * Panneau pour déplacer le nuage de point
		 */
		private class MoveControlFrame extends Panel{
			private Button xP;
			private Button xL;
			private Button yP;
			private Button yL;
			public MoveControlFrame(){
				super(new GridLayout(3,3));
				xP = new Button("→", new EventChangeView(ResultPanel.this, EventChangeView.action.MOVE, EventChangeView.dir.RIGHT));
				xL = new Button("←", new EventChangeView(ResultPanel.this, EventChangeView.action.MOVE, EventChangeView.dir.LEFT));
				yP = new Button("↓", new EventChangeView(ResultPanel.this, EventChangeView.action.MOVE, EventChangeView.dir.DOWN));
				yL = new Button("↑", new EventChangeView(ResultPanel.this, EventChangeView.action.MOVE, EventChangeView.dir.UP));
				
				this.add(new TextLine(""));
				this.add(yL, BorderLayout.NORTH);
				this.add(new TextLine(""));
				this.add(xL, BorderLayout.WEST);
				this.add(new TextLine(""));
				this.add(xP, BorderLayout.EAST);
				this.add(new TextLine(""));
				this.add(yP, BorderLayout.SOUTH);
				this.add(new TextLine(""));
			}
			
		}
		/*
		 * Panneau pour faire pivoter le nuage de points
		 */
		private class SpinControlFrame extends Panel{
			private Slider	angleSlider;
			
			public SpinControlFrame(){
				super();
				angleSlider = new Slider();
				angleSlider.addChangeListener(new EventChangeSpin(ResultPanel.this));
				this.add(new TextLine("Angle : "));
				this.add(angleSlider);
			}
			
		}
	}
}
