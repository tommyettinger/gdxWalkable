// Generated by Haxe 3.4.2
package haxe.ds;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringMap<T> extends haxe.lang.HxObject implements haxe.IMap<java.lang.String, T>
{
	public StringMap(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringMap()
	{
		haxe.ds.StringMap.__hx_ctor_haxe_ds_StringMap(this);
	}
	
	
	public static <T_c> void __hx_ctor_haxe_ds_StringMap(haxe.ds.StringMap<T_c> __hx_this)
	{
		__hx_this.cachedIndex = -1;
	}
	
	
	public int[] hashes;
	
	public java.lang.String[] _keys;
	
	public T[] vals;
	
	public int nBuckets;
	
	public int size;
	
	public int nOccupied;
	
	public int upperBound;
	
	public java.lang.String cachedKey;
	
	public int cachedIndex;
	
	public void set(java.lang.String key, T value)
	{
		int x;
		int k;
		if (( this.nOccupied >= this.upperBound )) 
		{
			if (( this.nBuckets > ( this.size << 1 ) )) 
			{
				this.resize(( this.nBuckets - 1 ));
			}
			else
			{
				this.resize(( this.nBuckets + 2 ));
			}
			
		}
		
		int[] hashes = this.hashes;
		java.lang.String[] keys = this._keys;
		{
			int mask = ( (( this.nBuckets == 0 )) ? (0) : (( this.nBuckets - 1 )) );
			x = this.nBuckets;
			int site = x;
			int k1 = key.hashCode();
			k1 = ( ( k1 + 2127912214 ) + (( k1 << 12 )) );
			k1 = ( ( k1 ^ -949894596 ) ^ ( k1 >> 19 ) );
			k1 = ( ( k1 + 374761393 ) + (( k1 << 5 )) );
			k1 = ( (k1 - 744332180) ^ ( k1 << 9 ) );
			k1 = ( (k1 - 42973499) + (( k1 << 3 )) );
			k1 = ( ( k1 ^ -1252372727 ) ^ ( k1 >> 16 ) );
			int ret = k1;
			if (( (( ret & -2 )) == 0 )) 
			{
				if (( ret == 0 )) 
				{
					ret = 2;
				}
				else
				{
					ret = -1;
				}
				
			}
			
			k = ret;
			int i = ( k & mask );
			int nProbes = 0;
			int delKey = -1;
			if (( hashes[i] == 0 ))
			{
				x = i;
			}
			else
			{
				int last = i;
				int flag;
				while (true)
				{
					boolean tmp;
					flag = hashes[i];
					if (( flag != 0 )) 
					{
						if (( flag == k )) 
						{
							tmp = haxe.lang.Runtime.valEq(this._keys[i], key);
						}
						else
						{
							tmp = false;
						}
						
					}
					else
					{
						tmp = true;
					}
					
					if ( ! (( ! (tmp) )) ) 
					{
						break;
					}
					
					if (( ( flag == 1 ) && ( delKey == -1 ) )) 
					{
						delKey = i;
					}
					
					i = ( ( i +  ++ nProbes ) & mask );
				}
				
				if (( ( flag == 0 ) && ( delKey != -1 ) )) 
				{
					x = delKey;
				}
				else
				{
					x = i;
				}
				
			}
			
		}
		
		int flag1 = hashes[x];
		if (( flag1 == 0 )) 
		{
			keys[x] = key;
			this.vals[x] = value;
			hashes[x] = k;
			this.size++;
			this.nOccupied++;
		}
		else
		{
			if (( flag1 == 1 )) 
			{
				keys[x] = key;
				this.vals[x] = value;
				hashes[x] = k;
				this.size++;
			}
			else
			{
				boolean x1 = haxe.lang.Runtime.valEq(this._keys[x], key);
				this.vals[x] = value;
			}
			
		}
		
		this.cachedIndex = x;
		this.cachedKey = key;
	}
	
	
	public int lookup(java.lang.String key)
	{
		if (( this.nBuckets != 0 )) 
		{
			int[] hashes = this.hashes;
			java.lang.String[] keys = this._keys;
			int mask = ( this.nBuckets - 1 );
			int k = key.hashCode();
			k = ( ( k + 2127912214 ) + (( k << 12 )) );
			k = ( ( k ^ -949894596 ) ^ ( k >> 19 ) );
			k = ( ( k + 374761393 ) + (( k << 5 )) );
			k = ( (k - 744332180) ^ ( k << 9 ) );
			k = ( (k - 42973499) + (( k << 3 )) );
			k = ( ( k ^ -1252372727 ) ^ ( k >> 16 ) );
			int ret = k;
			if (( (( ret & -2 )) == 0 )) 
			{
				if (( ret == 0 )) 
				{
					ret = 2;
				}
				else
				{
					ret = -1;
				}
				
			}

			int nProbes = 0;
			int i = ( ret & mask );
			int last = i;
			int flag;
			while (true)
			{
				boolean tmp;
				flag = hashes[i];
				if (( flag != 0 )) 
				{
					if ( ! ((( ( flag == 1 ) || ( flag != ret) ))) )
					{
						tmp =  ! (haxe.lang.Runtime.valEq(keys[i], key)) ;
					}
					else
					{
						tmp = true;
					}
					
				}
				else
				{
					tmp = false;
				}
				
				if ( ! (tmp) ) 
				{
					break;
				}
				
				i = ( ( i +  ++ nProbes ) & mask );
			}
			
			if (( (( flag & -2 )) == 0 )) 
			{
				return -1;
			}
			else
			{
				return i;
			}
			
		}
		
		return -1;
	}
	
	
	public void resize(int newNBuckets)
	{
		int[] newHash = null;
		int j = 1;
		{
			int x = newNBuckets;
			 -- x;
			x |= ( x >>> 1 );
			x |= ( x >>> 2 );
			x |= ( x >>> 4 );
			x |= ( x >>> 8 );
			x |= ( x >>> 16 );
			newNBuckets =  ++ x;
			if (( newNBuckets < 4 )) 
			{
				newNBuckets = 4;
			}
			
			if (( this.size >= ( ( newNBuckets * 0.77 ) + 0.5 ) )) 
			{
				j = 0;
			}
			else
			{
				newHash = new int[newNBuckets];
				if (( this.nBuckets < newNBuckets )) 
				{
					java.lang.String[] k = new java.lang.String[newNBuckets];
					if (( this._keys != null )) 
					{
						java.lang.System.arraycopy(this._keys, 0, k, 0, this.nBuckets);
					}
					
					this._keys = k;
					T[] v = ((T[]) new Object[newNBuckets]);
					if (( this.vals != null )) 
					{
						java.lang.System.arraycopy(this.vals, 0, v, 0, this.nBuckets);
					}
					
					this.vals = v;
				}
				
			}
			
		}
		
		if (( j != 0 )) 
		{
			this.cachedKey = null;
			this.cachedIndex = -1;
			j = -1;
			int nBuckets = this.nBuckets;
			java.lang.String[] _keys = this._keys;
			T[] vals = this.vals;
			int[] hashes = this.hashes;
			int newMask = ( newNBuckets - 1 );
			while ((  ++ j < nBuckets ))
			{
				int k1 = hashes[j];
				if (( (( k1 & -2 )) != 0 )) 
				{
					java.lang.String key = _keys[j];
					T val = vals[j];
					hashes[j] = 1;
					while (true)
					{
						int nProbes = 0;
						int i = ( k1 & newMask );
						while (( newHash[i] != 0 ))
						{
							i = ( ( i +  ++ nProbes ) & newMask );
						}
						
						newHash[i] = k1;
						boolean tmp;
						if (( i < nBuckets )) 
						{
							k1 = hashes[i];
							tmp = ( (( k1 & -2 )) != 0 );
						}
						else
						{
							tmp = false;
						}
						
						if (tmp) 
						{
							{
								java.lang.String tmp1 = _keys[i];
								_keys[i] = key;
								key = tmp1;
							}
							
							{
								T tmp2 = vals[i];
								vals[i] = val;
								val = tmp2;
							}
							
							hashes[i] = 1;
						}
						else
						{
							_keys[i] = key;
							vals[i] = val;
							break;
						}
						
					}
					
				}
				
			}
			
			if (( nBuckets > newNBuckets )) 
			{
				{
					java.lang.String[] k2 = new java.lang.String[newNBuckets];
					java.lang.System.arraycopy(_keys, 0, k2, 0, newNBuckets);
					this._keys = k2;
				}
				
				{
					T[] v1 = ((T[]) new Object[newNBuckets]);
					java.lang.System.arraycopy(vals, 0, v1, 0, newNBuckets);
					this.vals = v1;
				}
				
			}
			
			this.hashes = newHash;
			this.nBuckets = newNBuckets;
			this.nOccupied = this.size;
			this.upperBound = ((int) (( ( newNBuckets * 0.77 ) + .5 )) );
		}
		
	}
	
	
	public java.lang.Object get(java.lang.String key)
	{
		int idx = -1;
		boolean tmp;
		if (haxe.lang.Runtime.valEq(this.cachedKey, key)) 
		{
			idx = this.cachedIndex;
			tmp = ( idx != -1 );
		}
		else
		{
			tmp = false;
		}
		
		if (tmp) 
		{
			return this.vals[idx];
		}
		
		idx = this.lookup(key);
		if (( idx != -1 )) 
		{
			this.cachedKey = key;
			this.cachedIndex = idx;
			return this.vals[idx];
		}
		
		return null;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef1 = true;
			switch (field.hashCode())
			{
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						this.cachedIndex = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						this.nBuckets = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						this.upperBound = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						this.size = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						this.nOccupied = ((int) (value) );
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
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						this.cachedIndex = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case -1224424900:
				{
					if (field.equals("hashes")) 
					{
						this.hashes = ((int[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						this.cachedKey = haxe.lang.Runtime.toString(value);
						return value;
					}
					
					break;
				}
				
				
				case 91023059:
				{
					if (field.equals("_keys")) 
					{
						this._keys = ((java.lang.String[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						this.upperBound = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 3612018:
				{
					if (field.equals("vals")) 
					{
						this.vals = ((T[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						this.nOccupied = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						this.nBuckets = haxe.lang.Runtime.toInt(value);
						return value;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						this.size = haxe.lang.Runtime.toInt(value);
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
				case 102230:
				{
					if (field.equals("get")) 
					{
						return new haxe.lang.Closure(this, "get");
					}
					
					break;
				}
				
				
				case -1224424900:
				{
					if (field.equals("hashes")) 
					{
						return this.hashes;
					}
					
					break;
				}
				
				
				case -934437708:
				{
					if (field.equals("resize")) 
					{
						return new haxe.lang.Closure(this, "resize");
					}
					
					break;
				}
				
				
				case 91023059:
				{
					if (field.equals("_keys")) 
					{
						return this._keys;
					}
					
					break;
				}
				
				
				case -1097094790:
				{
					if (field.equals("lookup")) 
					{
						return new haxe.lang.Closure(this, "lookup");
					}
					
					break;
				}
				
				
				case 3612018:
				{
					if (field.equals("vals")) 
					{
						return this.vals;
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						return new haxe.lang.Closure(this, "set");
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						return this.nBuckets;
					}
					
					break;
				}
				
				
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						return this.cachedIndex;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						return this.size;
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						return this.cachedKey;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						return this.nOccupied;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						return this.upperBound;
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
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						return this.cachedIndex;
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						return this.nBuckets;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						return this.upperBound;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						return this.size;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						return this.nOccupied;
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
				case 102230:
				{
					if (field.equals("get")) 
					{
						return this.get(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef1 = false;
						this.set(haxe.lang.Runtime.toString(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -934437708:
				{
					if (field.equals("resize")) 
					{
						__temp_executeDef1 = false;
						this.resize(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -1097094790:
				{
					if (field.equals("lookup")) 
					{
						return this.lookup(haxe.lang.Runtime.toString(dynargs.__get(0)));
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
		baseArr.push("cachedIndex");
		baseArr.push("cachedKey");
		baseArr.push("upperBound");
		baseArr.push("nOccupied");
		baseArr.push("size");
		baseArr.push("nBuckets");
		baseArr.push("vals");
		baseArr.push("_keys");
		baseArr.push("hashes");
		super.__hx_getFields(baseArr);
	}
	
	
}


