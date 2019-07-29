# Quelques informations glannées sur l'API Docuware

## API 

> Il n'y a pas de doc API JAVA. S'inspirer de l'API **.NET**

[https://developer.docuware.com/dotNet/66b2ed1e-2aef-452a-97cd-5014bbf0242b.html](https://developer.docuware.com/dotNet/66b2ed1e-2aef-452a-97cd-5014bbf0242b.html)

[Formulaire pour tester la syntax en ligne](https://bpifrance2.cddoc.fr/DocuWare/Platform/FileCabinets/19a8cccd-a08b-47b9-97db-fbcd4717c126/Query/DialogExpression?dialogId=00000000-0000-0000-0000-000000000000)

### Sur les valeurs dans `DialogExpressionCondition`

[https://developer.docuware.com/sdk/platform-fox/html/P_DocuWare_Platform_ServerClient_DialogExpressionCondition_Value.htm](https://developer.docuware.com/sdk/platform-fox/html/P_DocuWare_Platform_ServerClient_DialogExpressionCondition_Value.htm)

> **Remarks**
>
> If a single value is specified then a exact search (or wild card search) is performed.
>
> **Remarks**
>
> If two values are specified then the condition denotes a range search.
>
> **Remarks**
>
> In case of two values where the first one is null a "less or equal than" search is performed. 
> If the second value is null a "greater or equal than" search is performed.

## Syntax de recherche :

### Documentation Docuware

[http://help.docuware.com/en/#b57855t51009n88242](http://help.docuware.com/en/#b57855t51009n88242)

#### Retrieving documents

The type of search run on the Web Client is always the additional option available on the Windows client
as _Extended search_. In this type of search, words such as AND and OR are evaluated
as logical operators and not as "normal" words.

If elements such as **AND**, **OR**, quotation marks ("), question marks (?) or back slashes (\\) are included
in the index term you want to search, you must note the following when entering the text.

| Index term you want to search | Enter in search dialog | Explanation |
|-------------------------------|------------------------|-------------|
| MILLER AND SON | "MILLER AND SON" | The quotation marks cause the whole string to be searched for, the AND is not evaluated as a logical operator |
| NOW OR NEVER | "NOW OR NEVER" | The quotation marks cause the whole string to be searched for, the OR is not evaluated as a logical operator |
| Program "Othello" | Program \\"Othello\\" | To ensure the quotation marks are evaluated as such in the search, a back slash must be placed in front of them. |
| Clever?123 | Clever\\?123 | To ensure question marks are evaluated as such in the search, a back slash must be placed before the question mark. |
|  | "Clever?123" | Alternatively, you can put the whole search string inside quotation marks. |
| C:\Documents | C:\\\\Documents | To ensure back slashes are evaluated as such in the search, another back slash must be placed in front of it. |
| Price List (UK) | Price List \\(UK\\) | To ensure the brackets are evaluated as such in the search, a back slash must be placed in front of them. |
|  | "Price List (UK)" | Alternatively, you can put the whole search string inside quotation marks. |

##### Search Operators

Except from numeric fields and date fields you can use these operators (please note uppercase):

| Operator | Entry in search dialog | Executed search |
|-------------------------------|------------------------|-------------|
| AND | *Miller* AND *Son* | searches for all documents containing Miller as well as Son in the index entry |
| OR | *Miller* OR *Son* | searches for all documents containing Miller or Son in the index entry |
| NOT | NOT *Miller* | searches for all documents with an index entry in the correspondant field but not containing Miller in the index entry |
| EMPTY() | EMPTY() | searches for all documents where the corresponding index field is empty |
| NOTEMPTY() | NOTEMPTY() | searches for all documents where the corresponding index field is not empty |
| CURRENTUSERSHORTNAME() | CURRENTUSERSHORTNAME() | searches for all documents where the shortname of the current user is the index entry |
| CURRENTUSERLONGNAME() | CURRENTUSERLONGNAME() | searches for all documents where the longname of the current user is the index entry |
| CURRENTUSEREMAIL() | CURRENTUSEREMAIL() | searches for all documents where the email adress of the current user is the index entry |

##### Using Search terms from Select Lists

If you use the placeholder `*` in the search dialog (i.e. *price list*), you won't get proposals from
external select lists.

##### OR-Search in a Keyword Field

To execute an OR search in a keyword field, enter the keywords connected with OR in the search field.
Then execute directly the search. Don't click on the Plus icon to
transfer the entry in the list below.

##### Fulltext Search

Please don't use a point (".") within the search string. In the fulltext logic, this caracter is
used as a word seperator.

##### More Tips about Search

You can find more tips and information about Searching Documents on our blog under the Topic [Search and Find](http://blog.docuware.com/product-news/topic/search-find).


### Astuce 

Trouvé sur [https://support.docuware.com/en-US/forums/questions-about-usage-and-configuration/ff2b7857-8f41-e911-a967-000d3ab3fe8a](https://support.docuware.com/en-US/forums/questions-about-usage-and-configuration/ff2b7857-8f41-e911-a967-000d3ab3fe8a)

```
One more (hopefully helpful) response on this... 
Here is the comment section of the Foxpro subroutine I wrote to run free queries via URL integration. Covers some of 
the experiences I have had doing integration queries:

===========================
REMEMBER! Field names in queries are case sensitive! Field names (in the database) are usually ALL CAPS. The actual 
database field name of a field can be viewed in the DocuWare Administration desktop application. Queries place field 
name in square brackets and the value on double-quotes. Though, for numeric fields,  the quotes appear to be optional. 
Operators can have whitespace around them. Here are example query expressions:
    
[DWDOCID]=123                                       && Query by the internal document ID.
[CUST_NO] = "WA60"                               && Query field "CUST_NO" to exactly match "WA60".
[LASTNAME] LIKE "K*"                             && Wildcard search.
[SHIPTO_STATE] = EMPTY()                   && Query SHIPTO_STATE for empty values.
[BILLTO_STATE] = NOTEMPTY()             && Query BILLTO_STATE for non-empty values.
[DocuWareFulltext] = "find this string"       && Full-text search.
[DWSTOREDATETIME] > 2017-06-14 19:45:31              && Date/time expression.
[START_DATE] >= 2016-06-01 AND [START_DATE] <= 2016-08-01    && Boolean conditional.

Expressions can be joined by AND or OR and can be qualified with NOT. Delimiters around string values MUST be 
double-quotes. Also, the conditional statements and compound keywords (e.g. LIKE, AND, OR, etc.) need to be capitalized 
as well. If multiple documents are found, a result list is displayed in the browser. If only one document matches the 
search, it is directly displayed.

*** SPECIAL NOTE WHEN USING DATE/TIME FIELDS ***  Date/time fields are stored in DocuWare as UTC timestamps. While 
queries in the web client or Platform SDK allow the use of local date/time formats, URL Integration queries appear to 
use the date/times passed in as-is and compare against the stored UTC timestamps. So, if you are using date/time fields 
in your query, the date/time values need to be converted to UTC to get accurate results.
===========================
```

