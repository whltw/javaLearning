/**
 * @license Copyright (c) 2003-2018, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see https://ckeditor.com/legal/ckeditor-oss-license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
	filebrowserBrowseUrl = '/assets/ckfinder/ckfinder.html';
    filebrowserImageBrowseUrl = '/assets/ckfinder/ckfinder.html?type=Images';
    filebrowserFlashBrowseUrl = '/assets/ckfinder/ckfinder.html?type=Flash';
    filebrowserUploadUrl = '/assets/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files';
    filebrowserImageUploadUrl = '/assets/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images';
    filebrowserFlashUploadUrl = '/assets/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash';

};
