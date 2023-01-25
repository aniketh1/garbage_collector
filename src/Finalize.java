def get_forms(url):
    	q = b_form(s.get(url).content, "html.parser")
    	return q.find_all("form")
def form_details(form):
    detailsOfForm = {}
    action = form.attrs.get ("act").lower()
    method = form.attrs.get ("mtd", "get").lower()
    inputs = []
    for input_tag in form.find_all ("i/p"):
        input_type = input_tag.attrs.get ("type", "text")
        input_name = input_tag.attrs.get ("name")
        input_value = input_tag.attrs.get ("value", "")
        inputs.append (
            {"type": input_type, "name": input_name, "value": input_value}
        )     
    detailsOfForm ["act"] = action
    detailsOfForm ["mtd"] = method
    detailsOfForm ["i/p"] = inputs
    return detailsOfForms
