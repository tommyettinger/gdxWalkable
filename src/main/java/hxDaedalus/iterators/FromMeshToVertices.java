// Generated by Haxe 3.4.2
package hxDaedalus.iterators;

@SuppressWarnings(value={"rawtypes"})
public class FromMeshToVertices extends haxe.lang.HxObject
{
	public FromMeshToVertices(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FromMeshToVertices()
	{
		hxDaedalus.iterators.FromMeshToVertices.__hx_ctor_hxDaedalus_iterators_FromMeshToVertices(this);
	}
	
	
	public static void __hx_ctor_hxDaedalus_iterators_FromMeshToVertices(hxDaedalus.iterators.FromMeshToVertices __hx_this)
	{
	}
	
	
	
	
	public hxDaedalus.data.Mesh _fromMesh;
	
	public int _currIndex;
	
	public hxDaedalus.data.Vertex _resultVertex;
	
	public hxDaedalus.data.Mesh set_fromMesh(hxDaedalus.data.Mesh value)
	{
		this._fromMesh = value;
		this._currIndex = 0;
		return value;
	}
	
	
	public hxDaedalus.data.Vertex next()
	{
		while (true)
		{
			if (( this._currIndex < this._fromMesh._vertices.length )) 
			{
				this._resultVertex = this._fromMesh._vertices.__get(this._currIndex);
				this._currIndex++;
			}
			else
			{
				this._resultVertex = null;
				break;
			}
			
			if ( ! (( ! (this._resultVertex.get_isReal()) )) ) 
			{
				break;
			}
			
		}
		
		return this._resultVertex;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						this._currIndex = ((int) (value) );
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
				case -1844345344:
				{
					if (field.equals("_resultVertex")) 
					{
						this._resultVertex = ((hxDaedalus.data.Vertex) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1244873545:
				{
					if (field.equals("fromMesh")) 
					{
						this.set_fromMesh(((hxDaedalus.data.Mesh) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						this._currIndex = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case -1154355690:
				{
					if (field.equals("_fromMesh")) 
					{
						this._fromMesh = ((hxDaedalus.data.Mesh) (value) );
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
				case 3377907:
				{
					if (field.equals("next")) 
					{
						return new haxe.lang.Closure(this, "next");
					}
					
					break;
				}
				
				
				case -1154355690:
				{
					if (field.equals("_fromMesh")) 
					{
						return this._fromMesh;
					}
					
					break;
				}
				
				
				case -1618935820:
				{
					if (field.equals("set_fromMesh")) 
					{
						return new haxe.lang.Closure(this, "set_fromMesh");
					}
					
					break;
				}
				
				
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						return this._currIndex;
					}
					
					break;
				}
				
				
				case -1844345344:
				{
					if (field.equals("_resultVertex")) 
					{
						return this._resultVertex;
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
				case -857179071:
				{
					if (field.equals("_currIndex")) 
					{
						return this._currIndex;
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
				case 3377907:
				{
					if (field.equals("next")) 
					{
						return this.next();
					}
					
					break;
				}
				
				
				case -1618935820:
				{
					if (field.equals("set_fromMesh")) 
					{
						return this.set_fromMesh(((hxDaedalus.data.Mesh) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef1) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_resultVertex");
		baseArr.push("_currIndex");
		baseArr.push("_fromMesh");
		baseArr.push("fromMesh");
		super.__hx_getFields(baseArr);
	}
	
	
}


