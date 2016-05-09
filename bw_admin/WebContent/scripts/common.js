function t(s) {
	if (typeof (s) == 'string')
		return JSON.parse(s);
	else
		return JSON.stringify(s);
}
function json2str(o) {
	var arr = [];
	var fmt = function(s) {
		if (typeof s == 'object' && s != null)
			return json2str(s);
		return /^(string|number)$/.test(typeof s) ? "'" + s + "'" : s;
	}
	for ( var i in o)
		arr.push("'" + i + "':" + fmt(o[i]));
	return '{' + arr.join(',') + '}';
}
function s2j(stringValue) {
	eval("var theJsonValue = " + stringValue);
	return theJsonValue;
}