// Generated by Haxe 3.4.2
package hxDaedalus.data.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Potrace extends haxe.lang.HxObject
{
	static
	{
		//line 15 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.math.Potrace.MAX_INT = 2147483647;
		//line 17 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.math.Potrace.maxDistance = ((double) (((int) (1.0) )) );
	}
	
	public Potrace(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Potrace()
	{
		//line 253 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.math.Potrace.__hx_ctor_hxDaedalus_data_math_Potrace(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_math_Potrace(hxDaedalus.data.math.Potrace __hx_this)
	{
	}
	
	
	public static int MAX_INT;
	
	public static double maxDistance;
	
//	public static haxe.root.Array<haxe.root.Array<java.lang.Object>> buildShapes(hxPixels._Pixels.PixelsData bmpData, hxPixels._Pixels.PixelsData debugBmp, wings.javaSwing.SimpleDrawingContext debugShape)
//	{
//		//line 22 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		haxe.root.Array<haxe.root.Array<java.lang.Object>> shapes = new haxe.root.Array<haxe.root.Array<java.lang.Object>>();
//		//line 23 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		haxe.ds.StringMap<java.lang.Object> dictPixelsDone = new haxe.ds.StringMap<java.lang.Object>();
//		//line 24 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		{
//			//line 24 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			int _g1 = 1;
//			//line 24 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			int _g = ( bmpData.height - 1 );
//			//line 24 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			while (( _g1 < _g ))
//			{
//				//line 24 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				int row = _g1++;
//				//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				{
//					//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					int _g3 = 0;
//					//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					int _g2 = ( bmpData.width - 1 );
//					//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					while (( _g3 < _g2 ))
//					{
//						//line 25 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//						int col = _g3++;
//						//line 26 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//						if (( ((boolean) (( hxPixels._Pixels.Pixels_Impl_.getPixel(bmpData, col, row) == 16777215 )) ) && ((boolean) (( hxPixels._Pixels.Pixels_Impl_.getPixel(bmpData, ( col + 1 ), row) < 16777215 )) ) ))
//						{
//							//line 28 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//							if (( ! (haxe.lang.Runtime.toBool(((java.lang.Object) (dictPixelsDone.get(( ( ( col + 1 ) + "_" ) + row ))) ))) ))
//							{
//								//line 29 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//								shapes.push(hxDaedalus.data.math.Potrace.buildShape(bmpData, row, ( col + 1 ), dictPixelsDone, debugBmp, debugShape));
//							}
//
//						}
//
//					}
//
//				}
//
//			}
//
//		}
//
//		//line 35 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		return shapes;
//	}
	
	
//	public static haxe.root.Array<java.lang.Object> buildShape(hxPixels._Pixels.PixelsData bmpData, int fromPixelRow, int fromPixelCol, haxe.ds.StringMap<java.lang.Object> dictPixelsDone, hxPixels._Pixels.PixelsData debugBmp, wings.javaSwing.SimpleDrawingContext debugShape)
//	{
//		//line 40 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		double newX = ((double) (fromPixelCol) );
//		//line 41 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		double newY = ((double) (fromPixelRow) );
//		//line 42 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		haxe.root.Array<java.lang.Object> path = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (newX) ), ((java.lang.Object) (newY) )});
//		//line 43 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		dictPixelsDone.set(( ( haxe.lang.Runtime.toString(newX) + "_" ) + haxe.lang.Runtime.toString(newY) ), true);
//		//line 45 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		hxDaedalus.data.math.Point2D curDir = new hxDaedalus.data.math.Point2D(0, 1);
//		//line 46 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		hxDaedalus.data.math.Point2D newDir = new hxDaedalus.data.math.Point2D(null, null);
//		//line 47 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		int newPixelRow = 0;
//		//line 48 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		int newPixelCol = 0;
//		//line 49 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		int count = -1;
//		//line 50 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		while (true)
//		{
//			//line 52 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			if (( debugBmp != null ))
//			{
//				//line 54 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				hxPixels._Pixels.Pixels_Impl_.setPixel32(debugBmp, fromPixelCol, fromPixelRow, -65536);
//			}
//
//			//line 59 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			newPixelRow = ((int) (( ( fromPixelRow + curDir.x ) + curDir.y )) );
//			//line 60 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			newPixelCol = ((int) (( ( fromPixelCol + curDir.x ) - curDir.y )) );
//			//line 63 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			if (((boolean) (( hxPixels._Pixels.Pixels_Impl_.getPixel(bmpData, newPixelCol, newPixelRow) < 16777215 )) ))
//			{
//				//line 65 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				newDir.x =  - (curDir.y) ;
//				//line 66 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				newDir.y = curDir.x;
//			}
//			else
//			{
//				//line 69 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				newPixelRow = ((int) (( fromPixelRow + curDir.y )) );
//				//line 70 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				newPixelCol = ((int) (( fromPixelCol + curDir.x )) );
//				//line 72 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				if (((boolean) (( hxPixels._Pixels.Pixels_Impl_.getPixel(bmpData, newPixelCol, newPixelRow) < 16777215 )) ))
//				{
//					//line 74 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					newDir.x = curDir.x;
//					//line 75 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					newDir.y = curDir.y;
//				}
//				else
//				{
//					//line 78 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					newPixelRow = fromPixelRow;
//					//line 79 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					newPixelCol = fromPixelCol;
//					//line 81 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					newDir.x = curDir.y;
//					//line 82 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//					newDir.y =  - (curDir.x) ;
//				}
//
//			}
//
//			//line 85 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			newX += curDir.x;
//			//line 86 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			newY += curDir.y;
//			//line 88 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			if (( ( newX == ((double) (haxe.lang.Runtime.toDouble(path.__get(0))) ) ) && ( newY == ((double) (haxe.lang.Runtime.toDouble(path.__get(1))) ) ) ))
//			{
//				//line 89 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				break;
//			}
//			else
//			{
//				//line 91 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				path.push(newX);
//				//line 92 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				path.push(newY);
//				//line 93 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				dictPixelsDone.set(( ( haxe.lang.Runtime.toString(newX) + "_" ) + haxe.lang.Runtime.toString(newY) ), true);
//				//line 94 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				fromPixelRow = newPixelRow;
//				//line 95 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				fromPixelCol = newPixelCol;
//				//line 96 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				curDir.x = newDir.x;
//				//line 97 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				curDir.y = newDir.y;
//			}
//
//			//line 100 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			 -- count;
//			//line 101 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			if (( count == 0 ))
//			{
//				//line 103 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				break;
//			}
//
//		}
//
//		//line 108 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		if (( debugShape != null ))
//		{
//			//line 110 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			debugShape.lineStyle(0.5, 65280, null);
//			//line 111 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			debugShape.moveTo(((double) (haxe.lang.Runtime.toDouble(path.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(path.__get(1))) ));
//			//line 112 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			int i = 2;
//			//line 113 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			while (( i < path.length ))
//			{
//				//line 114 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				debugShape.lineTo(((double) (haxe.lang.Runtime.toDouble(path.__get(i))) ), ((double) (haxe.lang.Runtime.toDouble(path.__get(( i + 1 )))) ));
//				//line 115 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//				i += 2;
//			}
//
//			//line 117 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//			debugShape.lineTo(((double) (haxe.lang.Runtime.toDouble(path.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(path.__get(1))) ));
//		}
//
//		//line 120 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
//		return path;
//	}
	
	
	public static hxDaedalus.data.graph.Graph buildGraph(haxe.root.Array<java.lang.Object> shape)
	{
		//line 125 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		int i = 0;
		//line 126 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.Graph graph = new hxDaedalus.data.graph.Graph();
		//line 127 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphNode node = null;
		//line 128 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		i = 0;
		//line 129 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		while (( i < shape.length ))
		{
			//line 130 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			node = graph.insertNode();
			//line 131 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			node.set_data(new hxDaedalus.data.math.NodeData());
			//line 132 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			node.get_data().index = i;
			//line 133 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			double shape1 = ((double) (haxe.lang.Runtime.toDouble(shape.__get(i))) );
			//line 133 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			double shape2 = ((double) (haxe.lang.Runtime.toDouble(shape.__get(( i + 1 )))) );
			//line 133 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			node.get_data().point = new hxDaedalus.data.math.Point2D(shape1, shape2);
			//line 134 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			i += 2;
		}
		
		//line 137 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphNode node1 = null;
		//line 138 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphNode node2 = null;
		//line 139 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphNode subNode = null;
		//line 140 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		double distSqrd = 0.0;
		//line 141 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		double sumDistSqrd = 0.0;
		//line 142 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		int count = 0;
		//line 143 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		boolean isValid = false;
		//line 144 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphEdge edge = null;
		//line 145 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.math.EdgeData edgeData = null;
		//line 146 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		node1 = graph.get_node();
		//line 147 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		while (( node1 != null ))
		{
			//line 149 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			if (( node1.get_next() != null )) 
			{
				//line 149 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				node2 = node1.get_next();
			}
			else
			{
				//line 149 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				node2 = graph.get_node();
			}
			
			//line 150 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			while (( node2 != node1 ))
			{
				//line 152 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				isValid = true;
				//line 153 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				if (( node1.get_next() != null )) 
				{
					//line 153 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					subNode = node1.get_next();
				}
				else
				{
					//line 153 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					subNode = graph.get_node();
				}
				
				//line 154 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				count = 2;
				//line 155 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				sumDistSqrd = ((double) (0) );
				//line 156 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				while (( subNode != node2 ))
				{
					//line 158 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					distSqrd = hxDaedalus.data.math.Geom2D.distanceSquaredPointToSegment(subNode.get_data().point.x, subNode.get_data().point.y, node1.get_data().point.x, node1.get_data().point.y, node2.get_data().point.x, node2.get_data().point.y);
					//line 159 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					if (( distSqrd < 0 )) 
					{
						//line 160 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
						distSqrd = ((double) (0) );
					}
					
					//line 161 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					if (( distSqrd >= hxDaedalus.data.math.Potrace.maxDistance )) 
					{
						//line 164 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
						isValid = false;
						//line 165 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
						break;
					}
					
					//line 168 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					 ++ count;
					//line 169 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					sumDistSqrd += distSqrd;
					//line 170 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					if (( subNode.get_next() != null )) 
					{
						//line 170 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
						subNode = subNode.get_next();
					}
					else
					{
						//line 170 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
						subNode = graph.get_node();
					}
					
				}
				
				//line 173 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				if ( ! (isValid) ) 
				{
					//line 176 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					break;
				}
				
				//line 179 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edge = graph.insertEdge(node1, node2);
				//line 180 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edgeData = new hxDaedalus.data.math.EdgeData();
				//line 181 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edgeData.sumDistancesSquared = sumDistSqrd;
				//line 182 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edgeData.length = node1.get_data().point.distanceTo(node2.get_data().point);
				//line 183 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edgeData.nodesCount = count;
				//line 184 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edge.set_data(edgeData);
				//line 186 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				if (( node2.get_next() != null )) 
				{
					//line 186 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					node2 = node2.get_next();
				}
				else
				{
					//line 186 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					node2 = graph.get_node();
				}
				
			}
			
			//line 189 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			node1 = node1.get_next();
		}
		
		//line 192 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		return graph;
	}
	
	
	public static haxe.root.Array<java.lang.Object> buildPolygon(hxDaedalus.data.graph.Graph graph, java.lang.Object debugShape)
	{
		//line 197 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		haxe.root.Array<java.lang.Object> polygon = new haxe.root.Array<java.lang.Object>();
		//line 199 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphNode currNode = null;
		//line 201 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		int minNodeIndex = 2147483647;
		//line 202 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphEdge edge = null;
		//line 203 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		double score = 0.0;
		//line 204 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		double higherScore = 0.0;
		//line 205 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		hxDaedalus.data.graph.GraphEdge lowerScoreEdge = null;
		//line 206 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		currNode = graph.get_node();
		//line 207 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		while (( currNode.get_data().index < minNodeIndex ))
		{
			//line 209 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			minNodeIndex = currNode.get_data().index;
			//line 211 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			polygon.push(currNode.get_data().point.x);
			//line 212 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			polygon.push(currNode.get_data().point.y);
			//line 214 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			higherScore = ((double) (0) );
			//line 216 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			edge = currNode.get_outgoingEdge();
			//line 217 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			while (( edge != null ))
			{
				//line 219 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				score = ( edge.get_data().nodesCount - ( edge.get_data().length * java.lang.Math.sqrt(( edge.get_data().sumDistancesSquared / edge.get_data().nodesCount )) ) );
				//line 220 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				if (( score > higherScore )) 
				{
					//line 222 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					higherScore = score;
					//line 223 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
					lowerScoreEdge = edge;
				}
				
				//line 226 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				edge = edge.get_rotNextEdge();
			}
			
			//line 229 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			currNode = lowerScoreEdge.get_destinationNode();
		}
		
		//line 232 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		if (( hxDaedalus.data.math.Geom2D.getDirection(((double) (haxe.lang.Runtime.toDouble(polygon.__get(( polygon.length - 2 )))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(( polygon.length - 1 )))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(3))) )) == 0 )) 
		{
			//line 234 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			polygon.shift();
			//line 235 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			polygon.shift();
		}
		
		//line 238 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		if (( ! (( debugShape == null )) )) 
		{
			//line 240 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(debugShape, "graphics", true), "lineStyle", new haxe.root.Array(new java.lang.Object[]{0.5, 255}));
			//line 241 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(debugShape, "graphics", true), "moveTo", new haxe.root.Array(new java.lang.Object[]{((double) (haxe.lang.Runtime.toDouble(polygon.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(1))) )}));
			//line 242 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			int i = 2;
			//line 243 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			while (( i < polygon.length ))
			{
				//line 244 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(debugShape, "graphics", true), "lineTo", new haxe.root.Array(new java.lang.Object[]{((double) (haxe.lang.Runtime.toDouble(polygon.__get(i))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(( i + 1 )))) )}));
				//line 245 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
				i += 2;
			}
			
			//line 247 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
			haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(debugShape, "graphics", true), "lineTo", new haxe.root.Array(new java.lang.Object[]{((double) (haxe.lang.Runtime.toDouble(polygon.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(polygon.__get(1))) )}));
		}
		
		//line 250 "/Users/tao/projects/hxDaedalus/src/hxDaedalus/data/math/Potrace.hx"
		return polygon;
	}
	
	
}


