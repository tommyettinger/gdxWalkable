// Generated by Haxe 3.4.2
package hxDaedalus.data.graph;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class GraphNode extends haxe.lang.HxObject
{
	static
	{
		hxDaedalus.data.graph.GraphNode.INC = 0;
	}
	
	public GraphNode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public GraphNode()
	{
		hxDaedalus.data.graph.GraphNode.__hx_ctor_hxDaedalus_data_graph_GraphNode(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_data_graph_GraphNode(hxDaedalus.data.graph.GraphNode __hx_this)
	{
		__hx_this._id = hxDaedalus.data.graph.GraphNode.INC;
		hxDaedalus.data.graph.GraphNode.INC++;
		__hx_this._successorNodes = new haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>();
	}
	
	
	public static int INC;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int _id;
	
	public hxDaedalus.data.graph.GraphNode _prev;
	
	public hxDaedalus.data.graph.GraphNode _next;
	
	public hxDaedalus.data.graph.GraphEdge _outgoingEdge;
	
	public haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> _successorNodes;
	
	public hxDaedalus.data.math.NodeData _data;
	
	public int get_id()
	{
		return this._id;
	}
	
	
	public void dispose()
	{
		this._prev = null;
		this._next = null;
		this._outgoingEdge = null;
		this._successorNodes = null;
		this._data = null;
	}
	
	
	public hxDaedalus.data.graph.GraphNode get_prev()
	{
		return this._prev;
	}
	
	
	public hxDaedalus.data.graph.GraphNode set_prev(hxDaedalus.data.graph.GraphNode value)
	{
		this._prev = value;
		return value;
	}
	
	
	public hxDaedalus.data.graph.GraphNode get_next()
	{
		return this._next;
	}
	
	
	public hxDaedalus.data.graph.GraphNode set_next(hxDaedalus.data.graph.GraphNode value)
	{
		this._next = value;
		return value;
	}
	
	
	public hxDaedalus.data.graph.GraphEdge get_outgoingEdge()
	{
		return this._outgoingEdge;
	}
	
	
	public hxDaedalus.data.graph.GraphEdge set_outgoingEdge(hxDaedalus.data.graph.GraphEdge value)
	{
		this._outgoingEdge = value;
		return value;
	}
	
	
	public haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> get_successorNodes()
	{
		return this._successorNodes;
	}
	
	
	public haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> set_successorNodes(haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge> value)
	{
		this._successorNodes = value;
		return value;
	}
	
	
	public hxDaedalus.data.math.NodeData get_data()
	{
		return this._data;
	}
	
	
	public hxDaedalus.data.math.NodeData set_data(hxDaedalus.data.math.NodeData value)
	{
		this._data = value;
		return value;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 94650:
				{
					if (field.equals("_id")) 
					{
						this._id = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 90810505:
				{
					if (field.equals("_data")) 
					{
						this._data = ((hxDaedalus.data.math.NodeData) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3449395:
				{
					if (field.equals("prev")) 
					{
						this.set_prev(((hxDaedalus.data.graph.GraphNode) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case -1144127670:
				{
					if (field.equals("_successorNodes")) 
					{
						this._successorNodes = ((haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3377907:
				{
					if (field.equals("next")) 
					{
						this.set_next(((hxDaedalus.data.graph.GraphNode) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case -1131550424:
				{
					if (field.equals("_outgoingEdge")) 
					{
						this._outgoingEdge = ((hxDaedalus.data.graph.GraphEdge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 971931465:
				{
					if (field.equals("outgoingEdge")) 
					{
						this.set_outgoingEdge(((hxDaedalus.data.graph.GraphEdge) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 91112402:
				{
					if (field.equals("_next")) 
					{
						this._next = ((hxDaedalus.data.graph.GraphNode) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 1667338539:
				{
					if (field.equals("successorNodes")) 
					{
						this.set_successorNodes(((haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 91183890:
				{
					if (field.equals("_prev")) 
					{
						this._prev = ((hxDaedalus.data.graph.GraphNode) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3076010:
				{
					if (field.equals("data")) 
					{
						this.set_data(((hxDaedalus.data.math.NodeData) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 94650:
				{
					if (field.equals("_id")) 
					{
						this._id = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 1415076199:
				{
					if (field.equals("set_data")) 
					{
						return new haxe.lang.Closure(this, "set_data");
					}
					
					break;
				}
				
				
				case 3355:
				{
					if (field.equals("id")) 
					{
						return this.get_id();
					}
					
					break;
				}
				
				
				case 1976188659:
				{
					if (field.equals("get_data")) 
					{
						return new haxe.lang.Closure(this, "get_data");
					}
					
					break;
				}
				
				
				case 3449395:
				{
					if (field.equals("prev")) 
					{
						return this.get_prev();
					}
					
					break;
				}
				
				
				case 309572264:
				{
					if (field.equals("set_successorNodes")) 
					{
						return new haxe.lang.Closure(this, "set_successorNodes");
					}
					
					break;
				}
				
				
				case 3377907:
				{
					if (field.equals("next")) 
					{
						return this.get_next();
					}
					
					break;
				}
				
				
				case -610461388:
				{
					if (field.equals("get_successorNodes")) 
					{
						return new haxe.lang.Closure(this, "get_successorNodes");
					}
					
					break;
				}
				
				
				case 971931465:
				{
					if (field.equals("outgoingEdge")) 
					{
						return this.get_outgoingEdge();
					}
					
					break;
				}
				
				
				case -584786938:
				{
					if (field.equals("set_outgoingEdge")) 
					{
						return new haxe.lang.Closure(this, "set_outgoingEdge");
					}
					
					break;
				}
				
				
				case 1667338539:
				{
					if (field.equals("successorNodes")) 
					{
						return this.get_successorNodes();
					}
					
					break;
				}
				
				
				case 1246655890:
				{
					if (field.equals("get_outgoingEdge")) 
					{
						return new haxe.lang.Closure(this, "get_outgoingEdge");
					}
					
					break;
				}
				
				
				case 3076010:
				{
					if (field.equals("data")) 
					{
						return this.get_data();
					}
					
					break;
				}
				
				
				case 1415378096:
				{
					if (field.equals("set_next")) 
					{
						return new haxe.lang.Closure(this, "set_next");
					}
					
					break;
				}
				
				
				case 94650:
				{
					if (field.equals("_id")) 
					{
						return this._id;
					}
					
					break;
				}
				
				
				case 1976490556:
				{
					if (field.equals("get_next")) 
					{
						return new haxe.lang.Closure(this, "get_next");
					}
					
					break;
				}
				
				
				case 91183890:
				{
					if (field.equals("_prev")) 
					{
						return this._prev;
					}
					
					break;
				}
				
				
				case 1415449584:
				{
					if (field.equals("set_prev")) 
					{
						return new haxe.lang.Closure(this, "set_prev");
					}
					
					break;
				}
				
				
				case 91112402:
				{
					if (field.equals("_next")) 
					{
						return this._next;
					}
					
					break;
				}
				
				
				case 1976562044:
				{
					if (field.equals("get_prev")) 
					{
						return new haxe.lang.Closure(this, "get_prev");
					}
					
					break;
				}
				
				
				case -1131550424:
				{
					if (field.equals("_outgoingEdge")) 
					{
						return this._outgoingEdge;
					}
					
					break;
				}
				
				
				case 1671767583:
				{
					if (field.equals("dispose")) 
					{
						return new haxe.lang.Closure(this, "dispose");
					}
					
					break;
				}
				
				
				case -1144127670:
				{
					if (field.equals("_successorNodes")) 
					{
						return this._successorNodes;
					}
					
					break;
				}
				
				
				case -1249338716:
				{
					if (field.equals("get_id")) 
					{
						return new haxe.lang.Closure(this, "get_id");
					}
					
					break;
				}
				
				
				case 90810505:
				{
					if (field.equals("_data")) 
					{
						return this._data;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 94650:
				{
					if (field.equals("_id")) 
					{
						return this._id;
					}
					
					break;
				}
				
				
				case 3355:
				{
					if (field.equals("id")) 
					{
						return this.get_id();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 1415076199:
				{
					if (field.equals("set_data")) 
					{
						return this.set_data(((hxDaedalus.data.math.NodeData) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -1249338716:
				{
					if (field.equals("get_id")) 
					{
						return this.get_id();
					}
					
					break;
				}
				
				
				case 1976188659:
				{
					if (field.equals("get_data")) 
					{
						return this.get_data();
					}
					
					break;
				}
				
				
				case 1671767583:
				{
					if (field.equals("dispose")) 
					{
						__temp_executeDef1 = false;
						this.dispose();
					}
					
					break;
				}
				
				
				case 309572264:
				{
					if (field.equals("set_successorNodes")) 
					{
						return this.set_successorNodes(((haxe.ds.ObjectMap<hxDaedalus.data.graph.GraphNode, hxDaedalus.data.graph.GraphEdge>) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1976562044:
				{
					if (field.equals("get_prev")) 
					{
						return this.get_prev();
					}
					
					break;
				}
				
				
				case -610461388:
				{
					if (field.equals("get_successorNodes")) 
					{
						return this.get_successorNodes();
					}
					
					break;
				}
				
				
				case 1415449584:
				{
					if (field.equals("set_prev")) 
					{
						return this.set_prev(((hxDaedalus.data.graph.GraphNode) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -584786938:
				{
					if (field.equals("set_outgoingEdge")) 
					{
						return this.set_outgoingEdge(((hxDaedalus.data.graph.GraphEdge) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1976490556:
				{
					if (field.equals("get_next")) 
					{
						return this.get_next();
					}
					
					break;
				}
				
				
				case 1246655890:
				{
					if (field.equals("get_outgoingEdge")) 
					{
						return this.get_outgoingEdge();
					}
					
					break;
				}
				
				
				case 1415378096:
				{
					if (field.equals("set_next")) 
					{
						return this.set_next(((hxDaedalus.data.graph.GraphNode) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_data");
		baseArr.push("_successorNodes");
		baseArr.push("_outgoingEdge");
		baseArr.push("_next");
		baseArr.push("_prev");
		baseArr.push("_id");
		baseArr.push("data");
		baseArr.push("successorNodes");
		baseArr.push("outgoingEdge");
		baseArr.push("next");
		baseArr.push("prev");
		baseArr.push("id");
		super.__hx_getFields(baseArr);
	}
	
	
}


