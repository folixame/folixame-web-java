(function() {
	function Shop( element ) {
		this.element = document.querySelector( element );
		this.init();
	}
	
	Shop.prototype = {
	  init: function() {
		// Properties
		
			this.wishesPrefix = "winery-"; // Prefix string to be prepended to the wishes's name in the session storage
			this.wishesName = this.wishesPrefix + "wishes"; // wishes name in the session storage
			this.storage = sessionStorage; // shortcut to the sessionStorage object
			
			this.formAddTowishes = document.querySelectorAll( "form.add-to-wishes" ); // Forms for adding items to the wishes
			this.formwishes = document.querySelector( "#shopping-wishes" ); // Shopping wishes form
			this.shoppingwishesActions = document.querySelector( "#shopping-wishes-actions" ); // wishes actions links
			this.updatewishesBtn = document.querySelector( "#update-wishes" ); // Update wishes button
			this.emptywishesBtn = document.querySelector( "#empty-wishes" ); // Empty wishes button

			// Method invocation
			
			this.createwishes();
			this.handleAddTowishesForm();
			this.emptywishes();
			this.updatewishes();
			this.displaywishes();
		},
		
		// Public methods
		
		// Creates the wishes keys in the session storage
		
		createwishes: function() {
			if( this.storage.getItem( this.wishesName ) == null ) {
			
				var wishes = {};
				wishes.items = [];
			
				this.storage.setItem( this.wishesName, this._toJSONString( wishes ) );
				this.storage.setItem( this.shippingRates, "0" );
				this.storage.setItem( this.total, "0" );
			}
		},
		// Displays the shopping wishes
		
		displaywishes: function() {
			if( this.formwishes !== null ) {
				var wishes = this._toJSONObject( this.storage.getItem( this.wishesName ) );
				var items = wishes.items;
				var tablewishes = document.querySelector( ".shopping-wishes" );
				var tablewishesBody = tablewishes.getElementsByTagName( "tbody" )[0];
				var origHTML = tablewishesBody.innerHTML;
				var html = "";
				
				
				for( var i = 0; i < items.length; ++i ) {
					var item = items[i];
					var product = item.product;
					html += "<tr><td class='pname'>" + "<div class='caption simpleCart_shelfItem'><p class='item_name'>"+ product + "</p><p class='item_add'><a href='javascript:;' class='btn btn-primary' role='button'>Add to cart</a></td>" + "</td></tr>";
					
				}
				tablewishesBody.innerHTML = origHTML + html;
			} 
				
				wishesBody.innerHTML = oHTML + htm;
		},
		// Empties the wishes by calling the _emptywishes() method
		// @see $.Shop._emptywishes()
		
		emptywishes: function() {
			var self = this;
			if( self.emptywishesBtn !== null ) {
				self.emptywishesBtn.addEventListener( "click", function() {
					self._emptywishes();
				}, false );
			}
		},
		// Updates the wishes
		
		updatewishes: function() {
			var self = this;
		  if( self.updatewishesBtn !== null ) {
			self.updatewishesBtn.addEventListener( "click", function() {
				var rows = document.querySelectorAll( "tbody tr" );
				var wishes = self.storage.getItem( self.wishesName );
				
				var updatedwishes = {};
				updatedwishes.items = [];
				
				for( var i = 0; i < rows.length; ++i ) {
					var row = rows[i];
					
					var wishesObj = {
						product: pname,
					};
					
					updatedwishes.items.push( wishesObj );
				}
				self.storage.setItem( self.wishesName, self._toJSONString( updatedwishes ) );
				
			}, false);
		  }
		},
		// Adds items to the shopping wishes
		
		handleAddTowishesForm: function() {
			var self = this;
			if( self.formAddTowishes.length > 0 ) {
			for( var i = 0; i < self.formAddTowishes.length; ++i ) {
				var form = self.formAddTowishes[i];
				var product = form.parentNode;
				var name =  product.getAttribute( "data-name" );
				self._addToFormwishes( form, name);
				
			}
			
			}
		},
		// Private methods
		
		
		// Empties the session storage
		
		_emptywishes: function() {
			this.storage.clear();
		},
		 
		/* Converts a JSON string to a JavaScript object
		 * @param str String the JSON string
		 * @returns obj Object the JavaScript object
		 */
		
		_toJSONObject: function( str ) {
			var obj = JSON.parse( str );
			return obj;
		},
		
		/* Converts a JavaScript object to a JSON string
		 * @param obj Object the JavaScript object
		 * @returns str String the JSON string
		 */
		
		
		_toJSONString: function( obj ) {
			var str = JSON.stringify( obj );
			return str;
		},
		
		
		/* Add an object to the wishes as a JSON string
		 * @param values Object the object to be added to the wishes
		 * @returns void
		 */
		
		
		_addTowishes: function( values ) {
			var wishes = this.storage.getItem( this.wishesName );
			
			var wishesObject = this._toJSONObject( wishes );
			var wishesCopy = wishesObject;
			var items = wishesCopy.items;
			items.push( values );
			
			this.storage.setItem( this.wishesName, this._toJSONString( wishesCopy ) );
		},
		
		/* Removes a given set of elements 
		 * @param elements String the elements to be removed
		 * @returns void
		 */
		 
		_removeElements: function( elements ) {
			var elems = document.querySelectorAll( elements );
			for( var i = 0; i < elems.length; ++i ) {
				var elem = elems[i];
				var parent = elem.parentNode;
				parent.removeChild( elem );
			}
		},
		
		/* Add an action to forms
		 * @param form Object the add to wishes form
		 * @param name String the product's name
		 * @param price String the product's price
		 * @returns void
		 */
		 
		_addToFormwishes: function( form, name, price ) {
			var self = this;
			form.addEventListener( "submit", function() {
					self._addTowishes({
						product: name,
					});
			}, false);
		
		}
	};
	
	document.addEventListener( "DOMContentLoaded", function() {
		var shop = new Shop( "#site" );
	});
	
	window.shop = new Shop( "#site" );

})();