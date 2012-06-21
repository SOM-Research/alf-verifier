/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.alf.alf.AlfFactory
 * @model kind="package"
 * @generated
 */
public interface AlfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/alf/Alf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlfPackage eINSTANCE = org.xtext.alf.alf.impl.AlfPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.OperationsImpl <em>Operations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.OperationsImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperations()
   * @generated
   */
  int OPERATIONS = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Operations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.OperationDefinitionOrStubImpl <em>Operation Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.OperationDefinitionOrStubImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationDefinitionOrStub()
   * @generated
   */
  int OPERATION_DEFINITION_OR_STUB = 1;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION_OR_STUB__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION_OR_STUB__BODY = 1;

  /**
   * The number of structural features of the '<em>Operation Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.OperationDeclarationImpl <em>Operation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.OperationDeclarationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationDeclaration()
   * @generated
   */
  int OPERATION_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__FORMAL_PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__RETURN_TYPE = 2;

  /**
   * The feature id for the '<em><b>Redefinition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__REDEFINITION = 3;

  /**
   * The number of structural features of the '<em>Operation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.FormalParametersImpl <em>Formal Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.FormalParametersImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFormalParameters()
   * @generated
   */
  int FORMAL_PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETERS__FORMAL_PARAMETER_LIST = 0;

  /**
   * The number of structural features of the '<em>Formal Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.FormalParameterListImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFormalParameterList()
   * @generated
   */
  int FORMAL_PARAMETER_LIST = 4;

  /**
   * The feature id for the '<em><b>Formal Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST__FORMAL_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Formal Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.FormalParameterImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFormalParameter()
   * @generated
   */
  int FORMAL_PARAMETER = 5;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__DIRECTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__TYPE = 2;

  /**
   * The number of structural features of the '<em>Formal Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.TypePartImpl <em>Type Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.TypePartImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTypePart()
   * @generated
   */
  int TYPE_PART = 6;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PART__TYPE_NAME = 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PART__MULTIPLICITY = 1;

  /**
   * The number of structural features of the '<em>Type Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.MultiplicityImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 7;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__RANGE = 0;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__ORDERED = 1;

  /**
   * The feature id for the '<em><b>Non Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__NON_UNIQUE = 2;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__SEQUENCE = 3;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.MultiplicityRangeImpl <em>Multiplicity Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.MultiplicityRangeImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getMultiplicityRange()
   * @generated
   */
  int MULTIPLICITY_RANGE = 8;

  /**
   * The feature id for the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_RANGE__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_RANGE__UPPER = 1;

  /**
   * The number of structural features of the '<em>Multiplicity Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NUMBER_LITERAL_WITHOUT_SUFFIXImpl <em>NUMBER LITERAL WITHOUT SUFFIX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NUMBER_LITERAL_WITHOUT_SUFFIXImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNUMBER_LITERAL_WITHOUT_SUFFIX()
   * @generated
   */
  int NUMBER_LITERAL_WITHOUT_SUFFIX = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_WITHOUT_SUFFIX__VALUE = 0;

  /**
   * The number of structural features of the '<em>NUMBER LITERAL WITHOUT SUFFIX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_WITHOUT_SUFFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.INTEGER_LITERAL_WITHOUT_SUFFIXImpl <em>INTEGER LITERAL WITHOUT SUFFIX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.INTEGER_LITERAL_WITHOUT_SUFFIXImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getINTEGER_LITERAL_WITHOUT_SUFFIX()
   * @generated
   */
  int INTEGER_LITERAL_WITHOUT_SUFFIX = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_WITHOUT_SUFFIX__VALUE = NUMBER_LITERAL_WITHOUT_SUFFIX__VALUE;

  /**
   * The number of structural features of the '<em>INTEGER LITERAL WITHOUT SUFFIX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_WITHOUT_SUFFIX_FEATURE_COUNT = NUMBER_LITERAL_WITHOUT_SUFFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.UNLIMITED_LITERAL_WITHOUT_SUFFIXImpl <em>UNLIMITED LITERAL WITHOUT SUFFIX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.UNLIMITED_LITERAL_WITHOUT_SUFFIXImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUNLIMITED_LITERAL_WITHOUT_SUFFIX()
   * @generated
   */
  int UNLIMITED_LITERAL_WITHOUT_SUFFIX = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL_WITHOUT_SUFFIX__VALUE = NUMBER_LITERAL_WITHOUT_SUFFIX__VALUE;

  /**
   * The number of structural features of the '<em>UNLIMITED LITERAL WITHOUT SUFFIX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL_WITHOUT_SUFFIX_FEATURE_COUNT = NUMBER_LITERAL_WITHOUT_SUFFIX_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.TypeNameImpl <em>Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.TypeNameImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTypeName()
   * @generated
   */
  int TYPE_NAME = 12;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME__QUALIFIED_NAME = 0;

  /**
   * The number of structural features of the '<em>Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.RedefinitionClauseImpl <em>Redefinition Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.RedefinitionClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getRedefinitionClause()
   * @generated
   */
  int REDEFINITION_CLAUSE = 13;

  /**
   * The feature id for the '<em><b>Redefined Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDEFINITION_CLAUSE__REDEFINED_OPERATIONS = 0;

  /**
   * The number of structural features of the '<em>Redefinition Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDEFINITION_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.TestImpl <em>Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.TestImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTest()
   * @generated
   */
  int TEST = 14;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Assign Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__ASSIGN_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__STATEMENTS = 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__BLOCK = 3;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ValueSpecificationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getValueSpecification()
   * @generated
   */
  int VALUE_SPECIFICATION = 58;

  /**
   * The number of structural features of the '<em>Value Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.LITERALImpl <em>LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.LITERALImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLITERAL()
   * @generated
   */
  int LITERAL = 15;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.BOOLEAN_LITERALImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBOOLEAN_LITERAL()
   * @generated
   */
  int BOOLEAN_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__SUFFIX = LITERAL__SUFFIX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BOOLEAN LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NUMBER_LITERALImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNUMBER_LITERAL()
   * @generated
   */
  int NUMBER_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__SUFFIX = LITERAL__SUFFIX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NUMBER LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.INTEGER_LITERALImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getINTEGER_LITERAL()
   * @generated
   */
  int INTEGER_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__SUFFIX = NUMBER_LITERAL__SUFFIX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = NUMBER_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>INTEGER LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.UNLIMITED_LITERALImpl <em>UNLIMITED LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.UNLIMITED_LITERALImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUNLIMITED_LITERAL()
   * @generated
   */
  int UNLIMITED_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL__SUFFIX = NUMBER_LITERAL__SUFFIX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL__VALUE = NUMBER_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>UNLIMITED LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.STRING_LITERALImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSTRING_LITERAL()
   * @generated
   */
  int STRING_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__SUFFIX = LITERAL__SUFFIX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>STRING LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NameExpressionImpl <em>Name Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NameExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNameExpression()
   * @generated
   */
  int NAME_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Prefix Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__PREFIX_OP = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__PATH = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__ID = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Invocation Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__INVOCATION_COMPLETION = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sequence Construction Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__SEQUENCE_CONSTRUCTION_COMPLETION = VALUE_SPECIFICATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Postfix Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__POSTFIX_OP = VALUE_SPECIFICATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Name Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.QualifiedNamePathImpl <em>Qualified Name Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.QualifiedNamePathImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getQualifiedNamePath()
   * @generated
   */
  int QUALIFIED_NAME_PATH = 22;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_PATH__NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Qualified Name Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.UnqualifiedNameImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUnqualifiedName()
   * @generated
   */
  int UNQUALIFIED_NAME = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUALIFIED_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUALIFIED_NAME__TEMPLATE_BINDING = 1;

  /**
   * The number of structural features of the '<em>Unqualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUALIFIED_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.TemplateBindingImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTemplateBinding()
   * @generated
   */
  int TEMPLATE_BINDING = 24;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__BINDINGS = 0;

  /**
   * The number of structural features of the '<em>Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NamedTemplateBindingImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNamedTemplateBinding()
   * @generated
   */
  int NAMED_TEMPLATE_BINDING = 25;

  /**
   * The feature id for the '<em><b>Formal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TEMPLATE_BINDING__FORMAL = 0;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TEMPLATE_BINDING__ACTUAL = 1;

  /**
   * The number of structural features of the '<em>Named Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TEMPLATE_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.QualifiedNameWithBindingImpl <em>Qualified Name With Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.QualifiedNameWithBindingImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getQualifiedNameWithBinding()
   * @generated
   */
  int QUALIFIED_NAME_WITH_BINDING = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITH_BINDING__ID = 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITH_BINDING__BINDING = 1;

  /**
   * The feature id for the '<em><b>Remaining</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITH_BINDING__REMAINING = 2;

  /**
   * The number of structural features of the '<em>Qualified Name With Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITH_BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.TupleImpl <em>Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.TupleImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTuple()
   * @generated
   */
  int TUPLE = 27;

  /**
   * The feature id for the '<em><b>Tuple Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE__TUPLE_ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.TupleElementImpl <em>Tuple Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.TupleElementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTupleElement()
   * @generated
   */
  int TUPLE_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_ELEMENT__ARGUMENT = 0;

  /**
   * The number of structural features of the '<em>Tuple Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceElementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceElement()
   * @generated
   */
  int SEQUENCE_ELEMENT = 70;

  /**
   * The number of structural features of the '<em>Sequence Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ConditionalTestExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConditionalTestExpression()
   * @generated
   */
  int CONDITIONAL_TEST_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_TEST_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>When True</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>When False</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional Test Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_TEST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ConditionalOrExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConditionalOrExpression()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>Conditional Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ConditionalAndExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConditionalAndExpression()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>Conditional And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.InclusiveOrExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInclusiveOrExpression()
   * @generated
   */
  int INCLUSIVE_OR_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>Inclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ExclusiveOrExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getExclusiveOrExpression()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AndExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.EqualityExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ClassificationExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationExpression()
   * @generated
   */
  int CLASSIFICATION_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION__TYPE_NAME = 2;

  /**
   * The number of structural features of the '<em>Classification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.RelationalExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getRelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ShiftExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getShiftExpression()
   * @generated
   */
  int SHIFT_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Shift Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AdditiveExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.MultiplicativeExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.UnaryExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXP = 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.PrimaryExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PREFIX = 0;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SuffixExpressionImpl <em>Suffix Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SuffixExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSuffixExpression()
   * @generated
   */
  int SUFFIX_EXPRESSION = 44;

  /**
   * The number of structural features of the '<em>Suffix Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.OperationCallExpressionImpl <em>Operation Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.OperationCallExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationCallExpression()
   * @generated
   */
  int OPERATION_CALL_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Operation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION__OPERATION_NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION__TUPLE = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.OperationCallExpressionWithoutDotImpl <em>Operation Call Expression Without Dot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.OperationCallExpressionWithoutDotImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationCallExpressionWithoutDot()
   * @generated
   */
  int OPERATION_CALL_EXPRESSION_WITHOUT_DOT = 46;

  /**
   * The feature id for the '<em><b>Operation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME = 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE = 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX = 2;

  /**
   * The number of structural features of the '<em>Operation Call Expression Without Dot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_EXPRESSION_WITHOUT_DOT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.PropertyCallExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getPropertyCallExpression()
   * @generated
   */
  int PROPERTY_CALL_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL_EXPRESSION__PROPERTY_NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL_EXPRESSION__INDEX = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.LinkOperationExpressionImpl <em>Link Operation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.LinkOperationExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationExpression()
   * @generated
   */
  int LINK_OPERATION_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_EXPRESSION__KIND = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_EXPRESSION__TUPLE = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Link Operation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.LinkOperationTupleImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationTuple()
   * @generated
   */
  int LINK_OPERATION_TUPLE = 49;

  /**
   * The feature id for the '<em><b>Link Operation Tuple Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Link Operation Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.LinkOperationTupleElementImpl <em>Link Operation Tuple Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.LinkOperationTupleElementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationTupleElement()
   * @generated
   */
  int LINK_OPERATION_TUPLE_ELEMENT = 50;

  /**
   * The feature id for the '<em><b>Object Or Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE = 0;

  /**
   * The feature id for the '<em><b>Role Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX = 1;

  /**
   * The feature id for the '<em><b>Object Value Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC = 2;

  /**
   * The number of structural features of the '<em>Link Operation Tuple Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceOperationExpressionImpl <em>Sequence Operation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceOperationExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceOperationExpression()
   * @generated
   */
  int SEQUENCE_OPERATION_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Operation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_EXPRESSION__OPERATION_NAME = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_EXPRESSION__TUPLE = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence Operation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceReductionExpressionImpl <em>Sequence Reduction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceReductionExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceReductionExpression()
   * @generated
   */
  int SEQUENCE_REDUCTION_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_REDUCTION_EXPRESSION__IS_ORDERED = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_REDUCTION_EXPRESSION__BEHAVIOR = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_REDUCTION_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence Reduction Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_REDUCTION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceExpansionExpressionImpl <em>Sequence Expansion Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceExpansionExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceExpansionExpression()
   * @generated
   */
  int SEQUENCE_EXPANSION_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXPANSION_EXPRESSION__SUFFIX = SUFFIX_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Expansion Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT = SUFFIX_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl <em>Select Or Reject Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SelectOrRejectOperationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSelectOrRejectOperation()
   * @generated
   */
  int SELECT_OR_REJECT_OPERATION = 54;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION__OP = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION__EXPR1 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION__EXPR2 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expr3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION__EXPR3 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION__EXPR4 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Select Or Reject Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OR_REJECT_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.CollectOrIterateOperationImpl <em>Collect Or Iterate Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.CollectOrIterateOperationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getCollectOrIterateOperation()
   * @generated
   */
  int COLLECT_OR_ITERATE_OPERATION = 55;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION__OP = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION__EXPR1 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION__EXPR2 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expr3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION__EXPR3 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION__EXPR4 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Collect Or Iterate Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OR_ITERATE_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ForAllOrExistsOrOneOperationImpl <em>For All Or Exists Or One Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ForAllOrExistsOrOneOperationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperation()
   * @generated
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION = 56;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__OP = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR1 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR2 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expr3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR3 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expr4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR4 = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>For All Or Exists Or One Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.IsUniqueOperationImpl <em>Is Unique Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.IsUniqueOperationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getIsUniqueOperation()
   * @generated
   */
  int IS_UNIQUE_OPERATION = 57;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_UNIQUE_OPERATION__SUFFIX = SEQUENCE_EXPANSION_EXPRESSION__SUFFIX;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_UNIQUE_OPERATION__NAME = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_UNIQUE_OPERATION__EXPR = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Is Unique Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_UNIQUE_OPERATION_FEATURE_COUNT = SEQUENCE_EXPANSION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NonLiteralValueSpecificationImpl <em>Non Literal Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NonLiteralValueSpecificationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNonLiteralValueSpecification()
   * @generated
   */
  int NON_LITERAL_VALUE_SPECIFICATION = 59;

  /**
   * The number of structural features of the '<em>Non Literal Value Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LITERAL_VALUE_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ParenthesizedExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getParenthesizedExpression()
   * @generated
   */
  int PARENTHESIZED_EXPRESSION = 60;

  /**
   * The feature id for the '<em><b>Exp Or Type Cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__EXP_OR_TYPE_CAST = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Casted</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__CASTED = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Parenthesized Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NullExpressionImpl <em>Null Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NullExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNullExpression()
   * @generated
   */
  int NULL_EXPRESSION = 61;

  /**
   * The number of structural features of the '<em>Null Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ThisExpressionImpl <em>This Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ThisExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getThisExpression()
   * @generated
   */
  int THIS_EXPRESSION = 62;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>This Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SuperInvocationExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSuperInvocationExpression()
   * @generated
   */
  int SUPER_INVOCATION_EXPRESSION = 63;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION__CLASS_NAME = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation Call Without Dot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION__OPERATION_CALL_WITHOUT_DOT = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION__OPERATION_CALL = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Super Invocation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.InstanceCreationExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInstanceCreationExpression()
   * @generated
   */
  int INSTANCE_CREATION_EXPRESSION = 64;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_EXPRESSION__TUPLE = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sequence Constuction Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_EXPRESSION__SUFFIX = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Instance Creation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceConstructionOrAccessCompletionImpl <em>Sequence Construction Or Access Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceConstructionOrAccessCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION = 65;

  /**
   * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__MULTIPLICITY_INDICATOR = 0;

  /**
   * The feature id for the '<em><b>Access Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__ACCESS_COMPLETION = 1;

  /**
   * The feature id for the '<em><b>Sequence Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__SEQUENCE_COMPLETION = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Sequence Construction Or Access Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AccessCompletionImpl <em>Access Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AccessCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAccessCompletion()
   * @generated
   */
  int ACCESS_COMPLETION = 66;

  /**
   * The feature id for the '<em><b>Access Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_COMPLETION__ACCESS_INDEX = 0;

  /**
   * The number of structural features of the '<em>Access Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.PartialSequenceConstructionCompletionImpl <em>Partial Sequence Construction Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.PartialSequenceConstructionCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getPartialSequenceConstructionCompletion()
   * @generated
   */
  int PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION = 67;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Partial Sequence Construction Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceConstructionCompletionImpl <em>Sequence Construction Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceConstructionCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceConstructionCompletion()
   * @generated
   */
  int SEQUENCE_CONSTRUCTION_COMPLETION = 68;

  /**
   * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Sequence Construction Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequenceConstructionExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceConstructionExpression()
   * @generated
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Sequence Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_ELEMENT = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION__RANGE_UPPER = SEQUENCE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence Construction Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ClassExtentExpressionImpl <em>Class Extent Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ClassExtentExpressionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassExtentExpression()
   * @generated
   */
  int CLASS_EXTENT_EXPRESSION = 71;

  /**
   * The number of structural features of the '<em>Class Extent Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXTENT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.BlockImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 72;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.StatementSequenceImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getStatementSequence()
   * @generated
   */
  int STATEMENT_SEQUENCE = 73;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Statement Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.StatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 77;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.InlineStatementImpl <em>Inline Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.InlineStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInlineStatement()
   * @generated
   */
  int INLINE_STATEMENT = 74;

  /**
   * The feature id for the '<em><b>Langage Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_STATEMENT__LANGAGE_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inline Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AnnotatedStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAnnotatedStatement()
   * @generated
   */
  int ANNOTATED_STATEMENT = 75;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_STATEMENT__ANNOTATION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotated Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.DocumentedStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getDocumentedStatement()
   * @generated
   */
  int DOCUMENTED_STATEMENT = 76;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_STATEMENT__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_STATEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Documented Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AnnotationImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 78;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__KIND = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ARGS = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.BlockStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 79;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.EmptyStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getEmptyStatement()
   * @generated
   */
  int EMPTY_STATEMENT = 80;

  /**
   * The number of structural features of the '<em>Empty Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.LocalNameDeclarationStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLocalNameDeclarationStatement()
   * @generated
   */
  int LOCAL_NAME_DECLARATION_STATEMENT = 81;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__INIT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Local Name Declaration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.IfStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 82;

  /**
   * The feature id for the '<em><b>Sequential Clausses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__SEQUENTIAL_CLAUSSES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Final Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__FINAL_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SequentialClausesImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequentialClauses()
   * @generated
   */
  int SEQUENTIAL_CLAUSES = 83;

  /**
   * The feature id for the '<em><b>Conccurent Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_CLAUSES__CONCCURENT_CLAUSES = 0;

  /**
   * The number of structural features of the '<em>Sequential Clauses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_CLAUSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ConcurrentClausesImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConcurrentClauses()
   * @generated
   */
  int CONCURRENT_CLAUSES = 84;

  /**
   * The feature id for the '<em><b>Non Final Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCURRENT_CLAUSES__NON_FINAL_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Concurrent Clauses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCURRENT_CLAUSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NonFinalClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNonFinalClause()
   * @generated
   */
  int NON_FINAL_CLAUSE = 85;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FINAL_CLAUSE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FINAL_CLAUSE__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Non Final Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FINAL_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.FinalClauseImpl <em>Final Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.FinalClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFinalClause()
   * @generated
   */
  int FINAL_CLAUSE = 86;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_CLAUSE__BLOCK = 0;

  /**
   * The number of structural features of the '<em>Final Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SwitchStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 87;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__DEFAULT_CLAUSE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SwitchClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchClause()
   * @generated
   */
  int SWITCH_CLAUSE = 88;

  /**
   * The feature id for the '<em><b>Switch Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CLAUSE__SWITCH_CASE = 0;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CLAUSE__STATEMENT_SEQUENCE = 1;

  /**
   * The number of structural features of the '<em>Switch Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SwitchCaseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 89;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SwitchDefaultClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchDefaultClause()
   * @generated
   */
  int SWITCH_DEFAULT_CLAUSE = 90;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>Switch Default Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFAULT_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.NonEmptyStatementSequenceImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNonEmptyStatementSequence()
   * @generated
   */
  int NON_EMPTY_STATEMENT_SEQUENCE = 91;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EMPTY_STATEMENT_SEQUENCE__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Non Empty Statement Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EMPTY_STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.WhileStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 92;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.DoStatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.DoStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getDoStatement()
   * @generated
   */
  int DO_STATEMENT = 93;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ForStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 94;

  /**
   * The feature id for the '<em><b>Control</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__CONTROL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ForControlImpl <em>For Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ForControlImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForControl()
   * @generated
   */
  int FOR_CONTROL = 95;

  /**
   * The feature id for the '<em><b>Loop Variable Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__LOOP_VARIABLE_DEFINITION = 0;

  /**
   * The number of structural features of the '<em>For Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.LoopVariableDefinitionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLoopVariableDefinition()
   * @generated
   */
  int LOOP_VARIABLE_DEFINITION = 96;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__EXPRESSION1 = 1;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__EXPRESSION2 = 2;

  /**
   * The number of structural features of the '<em>Loop Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.BreakStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBreakStatement()
   * @generated
   */
  int BREAK_STATEMENT = 97;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ReturnStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 98;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AcceptStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAcceptStatement()
   * @generated
   */
  int ACCEPT_STATEMENT = 99;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__CLAUSE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Simple Accept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__SIMPLE_ACCEPT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Compound Accept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__COMPOUND_ACCEPT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Accept Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SimpleAcceptStatementCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSimpleAcceptStatementCompletion()
   * @generated
   */
  int SIMPLE_ACCEPT_STATEMENT_COMPLETION = 100;

  /**
   * The number of structural features of the '<em>Simple Accept Statement Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ACCEPT_STATEMENT_COMPLETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.CompoundAcceptStatementCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getCompoundAcceptStatementCompletion()
   * @generated
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION = 101;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK = 0;

  /**
   * The feature id for the '<em><b>Accept Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Compound Accept Statement Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AcceptBlockImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAcceptBlock()
   * @generated
   */
  int ACCEPT_BLOCK = 102;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_BLOCK__CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_BLOCK__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Accept Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AcceptClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAcceptClause()
   * @generated
   */
  int ACCEPT_CLAUSE = 103;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_CLAUSE__NAME = 0;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_CLAUSE__QUALIFIED_NAME_LIST = 1;

  /**
   * The number of structural features of the '<em>Accept Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ClassifyStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassifyStatement()
   * @generated
   */
  int CLASSIFY_STATEMENT = 104;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFY_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFY_STATEMENT__CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Classify Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ClassificationClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationClause()
   * @generated
   */
  int CLASSIFICATION_CLAUSE = 105;

  /**
   * The feature id for the '<em><b>Classify From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE__CLASSIFY_FROM_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Classify To Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE__CLASSIFY_TO_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Reclassy All Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE__RECLASSY_ALL_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Classification Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ClassificationFromClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationFromClause()
   * @generated
   */
  int CLASSIFICATION_FROM_CLAUSE = 106;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST = 0;

  /**
   * The number of structural features of the '<em>Classification From Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_FROM_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ClassificationToClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationToClause()
   * @generated
   */
  int CLASSIFICATION_TO_CLAUSE = 107;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST = 0;

  /**
   * The number of structural features of the '<em>Classification To Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_TO_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ReclassifyAllClauseImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getReclassifyAllClause()
   * @generated
   */
  int RECLASSIFY_ALL_CLAUSE = 108;

  /**
   * The number of structural features of the '<em>Reclassify All Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECLASSIFY_ALL_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.QualifiedNameListImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getQualifiedNameList()
   * @generated
   */
  int QUALIFIED_NAME_LIST = 109;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_LIST__QUALIFIED_NAME = 0;

  /**
   * The number of structural features of the '<em>Qualified Name List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl <em>Invocation Or Assignement Or Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT = 110;

  /**
   * The feature id for the '<em><b>Type Part OR assigned Part OR invocation Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__TYPE_PART_OR_ASSIGNED_PART_OR_INVOCATION_PART = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Declaration Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__VARIABLE_DECLARATION_COMPLETION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assignment Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__ASSIGNMENT_COMPLETION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Invocation Or Assignement Or Declaration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.SuperInvocationStatementImpl <em>Super Invocation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.SuperInvocationStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSuperInvocationStatement()
   * @generated
   */
  int SUPER_INVOCATION_STATEMENT = 111;

  /**
   * The feature id for the '<em><b>super</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_STATEMENT__SUPER = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Super Invocation Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.ThisInvocationStatementImpl <em>This Invocation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.ThisInvocationStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getThisInvocationStatement()
   * @generated
   */
  int THIS_INVOCATION_STATEMENT = 112;

  /**
   * The feature id for the '<em><b>this</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_INVOCATION_STATEMENT__THIS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignment Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_INVOCATION_STATEMENT__ASSIGNMENT_COMPLETION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>This Invocation Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_INVOCATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.InstanceCreationInvocationStatementImpl <em>Instance Creation Invocation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.InstanceCreationInvocationStatementImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInstanceCreationInvocationStatement()
   * @generated
   */
  int INSTANCE_CREATION_INVOCATION_STATEMENT = 113;

  /**
   * The feature id for the '<em><b>new</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_INVOCATION_STATEMENT__NEW = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Creation Invocation Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_INVOCATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.VariableDeclarationCompletionImpl <em>Variable Declaration Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.VariableDeclarationCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getVariableDeclarationCompletion()
   * @generated
   */
  int VARIABLE_DECLARATION_COMPLETION = 114;

  /**
   * The feature id for the '<em><b>Multiplicity Indicator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_COMPLETION__MULTIPLICITY_INDICATOR = 0;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_COMPLETION__VARIABLE_NAME = 1;

  /**
   * The feature id for the '<em><b>Init Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_COMPLETION__INIT_VALUE = 2;

  /**
   * The number of structural features of the '<em>Variable Declaration Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_COMPLETION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.impl.AssignmentCompletionImpl <em>Assignment Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.impl.AssignmentCompletionImpl
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAssignmentCompletion()
   * @generated
   */
  int ASSIGNMENT_COMPLETION = 115;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_COMPLETION__OP = 0;

  /**
   * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_COMPLETION__RIGHT_HAND_SIDE = 1;

  /**
   * The number of structural features of the '<em>Assignment Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.ParameterDirection <em>Parameter Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.ParameterDirection
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getParameterDirection()
   * @generated
   */
  int PARAMETER_DIRECTION = 116;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.BooleanValue <em>Boolean Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.BooleanValue
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 117;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.LinkOperationKind <em>Link Operation Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.LinkOperationKind
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationKind()
   * @generated
   */
  int LINK_OPERATION_KIND = 118;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.SelectOrRejectOperator <em>Select Or Reject Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.SelectOrRejectOperator
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSelectOrRejectOperator()
   * @generated
   */
  int SELECT_OR_REJECT_OPERATOR = 119;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.CollectOrIterateOperator
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getCollectOrIterateOperator()
   * @generated
   */
  int COLLECT_OR_ITERATE_OPERATOR = 120;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperator
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperator()
   * @generated
   */
  int FOR_ALL_OR_EXISTS_OR_ONE_OPERATOR = 121;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.AnnotationKind <em>Annotation Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.AnnotationKind
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAnnotationKind()
   * @generated
   */
  int ANNOTATION_KIND = 122;

  /**
   * The meta object id for the '{@link org.xtext.alf.alf.AssignmentOperator <em>Assignment Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alf.alf.AssignmentOperator
   * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAssignmentOperator()
   * @generated
   */
  int ASSIGNMENT_OPERATOR = 123;


  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Operations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operations</em>'.
   * @see org.xtext.alf.alf.Operations
   * @generated
   */
  EClass getOperations();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.alf.alf.Operations#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Imports</em>'.
   * @see org.xtext.alf.alf.Operations#getImports()
   * @see #getOperations()
   * @generated
   */
  EAttribute getOperations_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.Operations#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.xtext.alf.alf.Operations#getOperations()
   * @see #getOperations()
   * @generated
   */
  EReference getOperations_Operations();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.OperationDefinitionOrStub <em>Operation Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Definition Or Stub</em>'.
   * @see org.xtext.alf.alf.OperationDefinitionOrStub
   * @generated
   */
  EClass getOperationDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationDefinitionOrStub#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see org.xtext.alf.alf.OperationDefinitionOrStub#getDeclaration()
   * @see #getOperationDefinitionOrStub()
   * @generated
   */
  EReference getOperationDefinitionOrStub_Declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationDefinitionOrStub#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.alf.alf.OperationDefinitionOrStub#getBody()
   * @see #getOperationDefinitionOrStub()
   * @generated
   */
  EReference getOperationDefinitionOrStub_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.OperationDeclaration <em>Operation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Declaration</em>'.
   * @see org.xtext.alf.alf.OperationDeclaration
   * @generated
   */
  EClass getOperationDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.OperationDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alf.alf.OperationDeclaration#getName()
   * @see #getOperationDeclaration()
   * @generated
   */
  EAttribute getOperationDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameters</em>'.
   * @see org.xtext.alf.alf.OperationDeclaration#getFormalParameters()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_FormalParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationDeclaration#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.xtext.alf.alf.OperationDeclaration#getReturnType()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationDeclaration#getRedefinition <em>Redefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Redefinition</em>'.
   * @see org.xtext.alf.alf.OperationDeclaration#getRedefinition()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_Redefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.FormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameters</em>'.
   * @see org.xtext.alf.alf.FormalParameters
   * @generated
   */
  EClass getFormalParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.FormalParameters#getFormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
   * @see org.xtext.alf.alf.FormalParameters#getFormalParameterList()
   * @see #getFormalParameters()
   * @generated
   */
  EReference getFormalParameters_FormalParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.FormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter List</em>'.
   * @see org.xtext.alf.alf.FormalParameterList
   * @generated
   */
  EClass getFormalParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.FormalParameterList#getFormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formal Parameter</em>'.
   * @see org.xtext.alf.alf.FormalParameterList#getFormalParameter()
   * @see #getFormalParameterList()
   * @generated
   */
  EReference getFormalParameterList_FormalParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.FormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter</em>'.
   * @see org.xtext.alf.alf.FormalParameter
   * @generated
   */
  EClass getFormalParameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.FormalParameter#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.xtext.alf.alf.FormalParameter#getDirection()
   * @see #getFormalParameter()
   * @generated
   */
  EAttribute getFormalParameter_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.FormalParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alf.alf.FormalParameter#getName()
   * @see #getFormalParameter()
   * @generated
   */
  EAttribute getFormalParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.FormalParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.alf.alf.FormalParameter#getType()
   * @see #getFormalParameter()
   * @generated
   */
  EReference getFormalParameter_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.TypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Part</em>'.
   * @see org.xtext.alf.alf.TypePart
   * @generated
   */
  EClass getTypePart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.TypePart#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.xtext.alf.alf.TypePart#getTypeName()
   * @see #getTypePart()
   * @generated
   */
  EReference getTypePart_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.TypePart#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.xtext.alf.alf.TypePart#getMultiplicity()
   * @see #getTypePart()
   * @generated
   */
  EReference getTypePart_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see org.xtext.alf.alf.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.Multiplicity#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.xtext.alf.alf.Multiplicity#getRange()
   * @see #getMultiplicity()
   * @generated
   */
  EReference getMultiplicity_Range();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.Multiplicity#isOrdered <em>Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordered</em>'.
   * @see org.xtext.alf.alf.Multiplicity#isOrdered()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Ordered();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.Multiplicity#isNonUnique <em>Non Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Non Unique</em>'.
   * @see org.xtext.alf.alf.Multiplicity#isNonUnique()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_NonUnique();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.Multiplicity#isSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence</em>'.
   * @see org.xtext.alf.alf.Multiplicity#isSequence()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Sequence();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.MultiplicityRange <em>Multiplicity Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Range</em>'.
   * @see org.xtext.alf.alf.MultiplicityRange
   * @generated
   */
  EClass getMultiplicityRange();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.MultiplicityRange#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower</em>'.
   * @see org.xtext.alf.alf.MultiplicityRange#getLower()
   * @see #getMultiplicityRange()
   * @generated
   */
  EReference getMultiplicityRange_Lower();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.MultiplicityRange#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper</em>'.
   * @see org.xtext.alf.alf.MultiplicityRange#getUpper()
   * @see #getMultiplicityRange()
   * @generated
   */
  EReference getMultiplicityRange_Upper();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NUMBER_LITERAL_WITHOUT_SUFFIX <em>NUMBER LITERAL WITHOUT SUFFIX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NUMBER LITERAL WITHOUT SUFFIX</em>'.
   * @see org.xtext.alf.alf.NUMBER_LITERAL_WITHOUT_SUFFIX
   * @generated
   */
  EClass getNUMBER_LITERAL_WITHOUT_SUFFIX();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.NUMBER_LITERAL_WITHOUT_SUFFIX#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.alf.alf.NUMBER_LITERAL_WITHOUT_SUFFIX#getValue()
   * @see #getNUMBER_LITERAL_WITHOUT_SUFFIX()
   * @generated
   */
  EAttribute getNUMBER_LITERAL_WITHOUT_SUFFIX_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.INTEGER_LITERAL_WITHOUT_SUFFIX <em>INTEGER LITERAL WITHOUT SUFFIX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INTEGER LITERAL WITHOUT SUFFIX</em>'.
   * @see org.xtext.alf.alf.INTEGER_LITERAL_WITHOUT_SUFFIX
   * @generated
   */
  EClass getINTEGER_LITERAL_WITHOUT_SUFFIX();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.UNLIMITED_LITERAL_WITHOUT_SUFFIX <em>UNLIMITED LITERAL WITHOUT SUFFIX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNLIMITED LITERAL WITHOUT SUFFIX</em>'.
   * @see org.xtext.alf.alf.UNLIMITED_LITERAL_WITHOUT_SUFFIX
   * @generated
   */
  EClass getUNLIMITED_LITERAL_WITHOUT_SUFFIX();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name</em>'.
   * @see org.xtext.alf.alf.TypeName
   * @generated
   */
  EClass getTypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.TypeName#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.xtext.alf.alf.TypeName#getQualifiedName()
   * @see #getTypeName()
   * @generated
   */
  EReference getTypeName_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.RedefinitionClause <em>Redefinition Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Redefinition Clause</em>'.
   * @see org.xtext.alf.alf.RedefinitionClause
   * @generated
   */
  EClass getRedefinitionClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.RedefinitionClause#getRedefinedOperations <em>Redefined Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Redefined Operations</em>'.
   * @see org.xtext.alf.alf.RedefinitionClause#getRedefinedOperations()
   * @see #getRedefinitionClause()
   * @generated
   */
  EReference getRedefinitionClause_RedefinedOperations();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test</em>'.
   * @see org.xtext.alf.alf.Test
   * @generated
   */
  EClass getTest();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.Test#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.alf.alf.Test#getExpression()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.Test#getAssignExpression <em>Assign Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assign Expression</em>'.
   * @see org.xtext.alf.alf.Test#getAssignExpression()
   * @see #getTest()
   * @generated
   */
  EReference getTest_AssignExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.Test#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.alf.alf.Test#getStatements()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Statements();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.Test#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.Test#getBlock()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.LITERAL <em>LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LITERAL</em>'.
   * @see org.xtext.alf.alf.LITERAL
   * @generated
   */
  EClass getLITERAL();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LITERAL#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.LITERAL#getSuffix()
   * @see #getLITERAL()
   * @generated
   */
  EReference getLITERAL_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN LITERAL</em>'.
   * @see org.xtext.alf.alf.BOOLEAN_LITERAL
   * @generated
   */
  EClass getBOOLEAN_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.BOOLEAN_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.alf.alf.BOOLEAN_LITERAL#getValue()
   * @see #getBOOLEAN_LITERAL()
   * @generated
   */
  EAttribute getBOOLEAN_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NUMBER LITERAL</em>'.
   * @see org.xtext.alf.alf.NUMBER_LITERAL
   * @generated
   */
  EClass getNUMBER_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.NUMBER_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.alf.alf.NUMBER_LITERAL#getValue()
   * @see #getNUMBER_LITERAL()
   * @generated
   */
  EAttribute getNUMBER_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INTEGER LITERAL</em>'.
   * @see org.xtext.alf.alf.INTEGER_LITERAL
   * @generated
   */
  EClass getINTEGER_LITERAL();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.UNLIMITED_LITERAL <em>UNLIMITED LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNLIMITED LITERAL</em>'.
   * @see org.xtext.alf.alf.UNLIMITED_LITERAL
   * @generated
   */
  EClass getUNLIMITED_LITERAL();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.STRING_LITERAL <em>STRING LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING LITERAL</em>'.
   * @see org.xtext.alf.alf.STRING_LITERAL
   * @generated
   */
  EClass getSTRING_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.STRING_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.alf.alf.STRING_LITERAL#getValue()
   * @see #getSTRING_LITERAL()
   * @generated
   */
  EAttribute getSTRING_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NameExpression <em>Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Expression</em>'.
   * @see org.xtext.alf.alf.NameExpression
   * @generated
   */
  EClass getNameExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.NameExpression#getPrefixOp <em>Prefix Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix Op</em>'.
   * @see org.xtext.alf.alf.NameExpression#getPrefixOp()
   * @see #getNameExpression()
   * @generated
   */
  EAttribute getNameExpression_PrefixOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NameExpression#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.xtext.alf.alf.NameExpression#getPath()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_Path();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.NameExpression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.alf.alf.NameExpression#getId()
   * @see #getNameExpression()
   * @generated
   */
  EAttribute getNameExpression_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NameExpression#getInvocationCompletion <em>Invocation Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invocation Completion</em>'.
   * @see org.xtext.alf.alf.NameExpression#getInvocationCompletion()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_InvocationCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NameExpression#getSequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Construction Completion</em>'.
   * @see org.xtext.alf.alf.NameExpression#getSequenceConstructionCompletion()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_SequenceConstructionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.NameExpression#getPostfixOp <em>Postfix Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postfix Op</em>'.
   * @see org.xtext.alf.alf.NameExpression#getPostfixOp()
   * @see #getNameExpression()
   * @generated
   */
  EAttribute getNameExpression_PostfixOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NameExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.NameExpression#getSuffix()
   * @see #getNameExpression()
   * @generated
   */
  EReference getNameExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.QualifiedNamePath <em>Qualified Name Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name Path</em>'.
   * @see org.xtext.alf.alf.QualifiedNamePath
   * @generated
   */
  EClass getQualifiedNamePath();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.QualifiedNamePath#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespace</em>'.
   * @see org.xtext.alf.alf.QualifiedNamePath#getNamespace()
   * @see #getQualifiedNamePath()
   * @generated
   */
  EReference getQualifiedNamePath_Namespace();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.UnqualifiedName <em>Unqualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqualified Name</em>'.
   * @see org.xtext.alf.alf.UnqualifiedName
   * @generated
   */
  EClass getUnqualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.UnqualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alf.alf.UnqualifiedName#getName()
   * @see #getUnqualifiedName()
   * @generated
   */
  EAttribute getUnqualifiedName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.UnqualifiedName#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Binding</em>'.
   * @see org.xtext.alf.alf.UnqualifiedName#getTemplateBinding()
   * @see #getUnqualifiedName()
   * @generated
   */
  EReference getUnqualifiedName_TemplateBinding();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Binding</em>'.
   * @see org.xtext.alf.alf.TemplateBinding
   * @generated
   */
  EClass getTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.TemplateBinding#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.xtext.alf.alf.TemplateBinding#getBindings()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_Bindings();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NamedTemplateBinding <em>Named Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Template Binding</em>'.
   * @see org.xtext.alf.alf.NamedTemplateBinding
   * @generated
   */
  EClass getNamedTemplateBinding();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.NamedTemplateBinding#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Formal</em>'.
   * @see org.xtext.alf.alf.NamedTemplateBinding#getFormal()
   * @see #getNamedTemplateBinding()
   * @generated
   */
  EAttribute getNamedTemplateBinding_Formal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NamedTemplateBinding#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see org.xtext.alf.alf.NamedTemplateBinding#getActual()
   * @see #getNamedTemplateBinding()
   * @generated
   */
  EReference getNamedTemplateBinding_Actual();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.QualifiedNameWithBinding <em>Qualified Name With Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name With Binding</em>'.
   * @see org.xtext.alf.alf.QualifiedNameWithBinding
   * @generated
   */
  EClass getQualifiedNameWithBinding();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.QualifiedNameWithBinding#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.alf.alf.QualifiedNameWithBinding#getId()
   * @see #getQualifiedNameWithBinding()
   * @generated
   */
  EAttribute getQualifiedNameWithBinding_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.QualifiedNameWithBinding#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.xtext.alf.alf.QualifiedNameWithBinding#getBinding()
   * @see #getQualifiedNameWithBinding()
   * @generated
   */
  EReference getQualifiedNameWithBinding_Binding();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.QualifiedNameWithBinding#getRemaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remaining</em>'.
   * @see org.xtext.alf.alf.QualifiedNameWithBinding#getRemaining()
   * @see #getQualifiedNameWithBinding()
   * @generated
   */
  EReference getQualifiedNameWithBinding_Remaining();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple</em>'.
   * @see org.xtext.alf.alf.Tuple
   * @generated
   */
  EClass getTuple();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.Tuple#getTupleElements <em>Tuple Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tuple Elements</em>'.
   * @see org.xtext.alf.alf.Tuple#getTupleElements()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_TupleElements();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.TupleElement <em>Tuple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Element</em>'.
   * @see org.xtext.alf.alf.TupleElement
   * @generated
   */
  EClass getTupleElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.TupleElement#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see org.xtext.alf.alf.TupleElement#getArgument()
   * @see #getTupleElement()
   * @generated
   */
  EReference getTupleElement_Argument();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.alf.alf.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Test Expression</em>'.
   * @see org.xtext.alf.alf.ConditionalTestExpression
   * @generated
   */
  EClass getConditionalTestExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ConditionalTestExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.alf.alf.ConditionalTestExpression#getExp()
   * @see #getConditionalTestExpression()
   * @generated
   */
  EReference getConditionalTestExpression_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ConditionalTestExpression#getWhenTrue <em>When True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When True</em>'.
   * @see org.xtext.alf.alf.ConditionalTestExpression#getWhenTrue()
   * @see #getConditionalTestExpression()
   * @generated
   */
  EReference getConditionalTestExpression_WhenTrue();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ConditionalTestExpression#getWhenFalse <em>When False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When False</em>'.
   * @see org.xtext.alf.alf.ConditionalTestExpression#getWhenFalse()
   * @see #getConditionalTestExpression()
   * @generated
   */
  EReference getConditionalTestExpression_WhenFalse();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression</em>'.
   * @see org.xtext.alf.alf.ConditionalOrExpression
   * @generated
   */
  EClass getConditionalOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.ConditionalOrExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.ConditionalOrExpression#getExp()
   * @see #getConditionalOrExpression()
   * @generated
   */
  EReference getConditionalOrExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression</em>'.
   * @see org.xtext.alf.alf.ConditionalAndExpression
   * @generated
   */
  EClass getConditionalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.ConditionalAndExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.ConditionalAndExpression#getExp()
   * @see #getConditionalAndExpression()
   * @generated
   */
  EReference getConditionalAndExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive Or Expression</em>'.
   * @see org.xtext.alf.alf.InclusiveOrExpression
   * @generated
   */
  EClass getInclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.InclusiveOrExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.InclusiveOrExpression#getExp()
   * @see #getInclusiveOrExpression()
   * @generated
   */
  EReference getInclusiveOrExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression</em>'.
   * @see org.xtext.alf.alf.ExclusiveOrExpression
   * @generated
   */
  EClass getExclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.ExclusiveOrExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.ExclusiveOrExpression#getExp()
   * @see #getExclusiveOrExpression()
   * @generated
   */
  EReference getExclusiveOrExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.xtext.alf.alf.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.AndExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.AndExpression#getExp()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.xtext.alf.alf.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.EqualityExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.EqualityExpression#getExp()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.alf.alf.EqualityExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.xtext.alf.alf.EqualityExpression#getOp()
   * @see #getEqualityExpression()
   * @generated
   */
  EAttribute getEqualityExpression_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ClassificationExpression <em>Classification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Expression</em>'.
   * @see org.xtext.alf.alf.ClassificationExpression
   * @generated
   */
  EClass getClassificationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.alf.alf.ClassificationExpression#getExp()
   * @see #getClassificationExpression()
   * @generated
   */
  EReference getClassificationExpression_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ClassificationExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.ClassificationExpression#getOp()
   * @see #getClassificationExpression()
   * @generated
   */
  EAttribute getClassificationExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationExpression#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.xtext.alf.alf.ClassificationExpression#getTypeName()
   * @see #getClassificationExpression()
   * @generated
   */
  EReference getClassificationExpression_TypeName();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see org.xtext.alf.alf.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.RelationalExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.alf.alf.RelationalExpression#getLeft()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.RelationalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.RelationalExpression#getOp()
   * @see #getRelationalExpression()
   * @generated
   */
  EAttribute getRelationalExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.RelationalExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.alf.alf.RelationalExpression#getRight()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression</em>'.
   * @see org.xtext.alf.alf.ShiftExpression
   * @generated
   */
  EClass getShiftExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.ShiftExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.ShiftExpression#getExp()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ShiftExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.ShiftExpression#getOp()
   * @see #getShiftExpression()
   * @generated
   */
  EAttribute getShiftExpression_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see org.xtext.alf.alf.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.AdditiveExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.AdditiveExpression#getExp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.alf.alf.AdditiveExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.xtext.alf.alf.AdditiveExpression#getOp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EAttribute getAdditiveExpression_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see org.xtext.alf.alf.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.MultiplicativeExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.alf.alf.MultiplicativeExpression#getExp()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Exp();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.alf.alf.MultiplicativeExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.xtext.alf.alf.MultiplicativeExpression#getOp()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EAttribute getMultiplicativeExpression_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.xtext.alf.alf.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.UnaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.UnaryExpression#getOp()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.UnaryExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.alf.alf.UnaryExpression#getExp()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.xtext.alf.alf.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.PrimaryExpression#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see org.xtext.alf.alf.PrimaryExpression#getPrefix()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Prefix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SuffixExpression <em>Suffix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suffix Expression</em>'.
   * @see org.xtext.alf.alf.SuffixExpression
   * @generated
   */
  EClass getSuffixExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.OperationCallExpression <em>Operation Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call Expression</em>'.
   * @see org.xtext.alf.alf.OperationCallExpression
   * @generated
   */
  EClass getOperationCallExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.OperationCallExpression#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Name</em>'.
   * @see org.xtext.alf.alf.OperationCallExpression#getOperationName()
   * @see #getOperationCallExpression()
   * @generated
   */
  EAttribute getOperationCallExpression_OperationName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationCallExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.xtext.alf.alf.OperationCallExpression#getTuple()
   * @see #getOperationCallExpression()
   * @generated
   */
  EReference getOperationCallExpression_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationCallExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.OperationCallExpression#getSuffix()
   * @see #getOperationCallExpression()
   * @generated
   */
  EReference getOperationCallExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.OperationCallExpressionWithoutDot <em>Operation Call Expression Without Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call Expression Without Dot</em>'.
   * @see org.xtext.alf.alf.OperationCallExpressionWithoutDot
   * @generated
   */
  EClass getOperationCallExpressionWithoutDot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.OperationCallExpressionWithoutDot#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Name</em>'.
   * @see org.xtext.alf.alf.OperationCallExpressionWithoutDot#getOperationName()
   * @see #getOperationCallExpressionWithoutDot()
   * @generated
   */
  EAttribute getOperationCallExpressionWithoutDot_OperationName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationCallExpressionWithoutDot#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.xtext.alf.alf.OperationCallExpressionWithoutDot#getTuple()
   * @see #getOperationCallExpressionWithoutDot()
   * @generated
   */
  EReference getOperationCallExpressionWithoutDot_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.OperationCallExpressionWithoutDot#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.OperationCallExpressionWithoutDot#getSuffix()
   * @see #getOperationCallExpressionWithoutDot()
   * @generated
   */
  EReference getOperationCallExpressionWithoutDot_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.PropertyCallExpression <em>Property Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Call Expression</em>'.
   * @see org.xtext.alf.alf.PropertyCallExpression
   * @generated
   */
  EClass getPropertyCallExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.PropertyCallExpression#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Name</em>'.
   * @see org.xtext.alf.alf.PropertyCallExpression#getPropertyName()
   * @see #getPropertyCallExpression()
   * @generated
   */
  EAttribute getPropertyCallExpression_PropertyName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.PropertyCallExpression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.xtext.alf.alf.PropertyCallExpression#getIndex()
   * @see #getPropertyCallExpression()
   * @generated
   */
  EReference getPropertyCallExpression_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.PropertyCallExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.PropertyCallExpression#getSuffix()
   * @see #getPropertyCallExpression()
   * @generated
   */
  EReference getPropertyCallExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.LinkOperationExpression <em>Link Operation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Expression</em>'.
   * @see org.xtext.alf.alf.LinkOperationExpression
   * @generated
   */
  EClass getLinkOperationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.LinkOperationExpression#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.xtext.alf.alf.LinkOperationExpression#getKind()
   * @see #getLinkOperationExpression()
   * @generated
   */
  EAttribute getLinkOperationExpression_Kind();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LinkOperationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.xtext.alf.alf.LinkOperationExpression#getTuple()
   * @see #getLinkOperationExpression()
   * @generated
   */
  EReference getLinkOperationExpression_Tuple();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.LinkOperationTuple <em>Link Operation Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Tuple</em>'.
   * @see org.xtext.alf.alf.LinkOperationTuple
   * @generated
   */
  EClass getLinkOperationTuple();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.LinkOperationTuple#getLinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Link Operation Tuple Element</em>'.
   * @see org.xtext.alf.alf.LinkOperationTuple#getLinkOperationTupleElement()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_LinkOperationTupleElement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.LinkOperationTupleElement <em>Link Operation Tuple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Tuple Element</em>'.
   * @see org.xtext.alf.alf.LinkOperationTupleElement
   * @generated
   */
  EClass getLinkOperationTupleElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Or Role</em>'.
   * @see org.xtext.alf.alf.LinkOperationTupleElement#getObjectOrRole()
   * @see #getLinkOperationTupleElement()
   * @generated
   */
  EAttribute getLinkOperationTupleElement_ObjectOrRole();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Role Index</em>'.
   * @see org.xtext.alf.alf.LinkOperationTupleElement#getRoleIndex()
   * @see #getLinkOperationTupleElement()
   * @generated
   */
  EReference getLinkOperationTupleElement_RoleIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LinkOperationTupleElement#getObjectValueSpec <em>Object Value Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Value Spec</em>'.
   * @see org.xtext.alf.alf.LinkOperationTupleElement#getObjectValueSpec()
   * @see #getLinkOperationTupleElement()
   * @generated
   */
  EReference getLinkOperationTupleElement_ObjectValueSpec();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceOperationExpression <em>Sequence Operation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Operation Expression</em>'.
   * @see org.xtext.alf.alf.SequenceOperationExpression
   * @generated
   */
  EClass getSequenceOperationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SequenceOperationExpression#getOperationName <em>Operation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation Name</em>'.
   * @see org.xtext.alf.alf.SequenceOperationExpression#getOperationName()
   * @see #getSequenceOperationExpression()
   * @generated
   */
  EAttribute getSequenceOperationExpression_OperationName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceOperationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.xtext.alf.alf.SequenceOperationExpression#getTuple()
   * @see #getSequenceOperationExpression()
   * @generated
   */
  EReference getSequenceOperationExpression_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceOperationExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.SequenceOperationExpression#getSuffix()
   * @see #getSequenceOperationExpression()
   * @generated
   */
  EReference getSequenceOperationExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceReductionExpression <em>Sequence Reduction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Reduction Expression</em>'.
   * @see org.xtext.alf.alf.SequenceReductionExpression
   * @generated
   */
  EClass getSequenceReductionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SequenceReductionExpression#isIsOrdered <em>Is Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Ordered</em>'.
   * @see org.xtext.alf.alf.SequenceReductionExpression#isIsOrdered()
   * @see #getSequenceReductionExpression()
   * @generated
   */
  EAttribute getSequenceReductionExpression_IsOrdered();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceReductionExpression#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior</em>'.
   * @see org.xtext.alf.alf.SequenceReductionExpression#getBehavior()
   * @see #getSequenceReductionExpression()
   * @generated
   */
  EReference getSequenceReductionExpression_Behavior();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceReductionExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.SequenceReductionExpression#getSuffix()
   * @see #getSequenceReductionExpression()
   * @generated
   */
  EReference getSequenceReductionExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceExpansionExpression <em>Sequence Expansion Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Expansion Expression</em>'.
   * @see org.xtext.alf.alf.SequenceExpansionExpression
   * @generated
   */
  EClass getSequenceExpansionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceExpansionExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.SequenceExpansionExpression#getSuffix()
   * @see #getSequenceExpansionExpression()
   * @generated
   */
  EReference getSequenceExpansionExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SelectOrRejectOperation <em>Select Or Reject Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Or Reject Operation</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperation
   * @generated
   */
  EClass getSelectOrRejectOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SelectOrRejectOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperation#getOp()
   * @see #getSelectOrRejectOperation()
   * @generated
   */
  EAttribute getSelectOrRejectOperation_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr1</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperation#getExpr1()
   * @see #getSelectOrRejectOperation()
   * @generated
   */
  EAttribute getSelectOrRejectOperation_Expr1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr2</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperation#getExpr2()
   * @see #getSelectOrRejectOperation()
   * @generated
   */
  EAttribute getSelectOrRejectOperation_Expr2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr3 <em>Expr3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr3</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperation#getExpr3()
   * @see #getSelectOrRejectOperation()
   * @generated
   */
  EAttribute getSelectOrRejectOperation_Expr3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr4 <em>Expr4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr4</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperation#getExpr4()
   * @see #getSelectOrRejectOperation()
   * @generated
   */
  EAttribute getSelectOrRejectOperation_Expr4();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.CollectOrIterateOperation <em>Collect Or Iterate Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collect Or Iterate Operation</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperation
   * @generated
   */
  EClass getCollectOrIterateOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.CollectOrIterateOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperation#getOp()
   * @see #getCollectOrIterateOperation()
   * @generated
   */
  EAttribute getCollectOrIterateOperation_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.CollectOrIterateOperation#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr1</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperation#getExpr1()
   * @see #getCollectOrIterateOperation()
   * @generated
   */
  EAttribute getCollectOrIterateOperation_Expr1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.CollectOrIterateOperation#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr2</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperation#getExpr2()
   * @see #getCollectOrIterateOperation()
   * @generated
   */
  EAttribute getCollectOrIterateOperation_Expr2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.CollectOrIterateOperation#getExpr3 <em>Expr3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr3</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperation#getExpr3()
   * @see #getCollectOrIterateOperation()
   * @generated
   */
  EAttribute getCollectOrIterateOperation_Expr3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.CollectOrIterateOperation#getExpr4 <em>Expr4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr4</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperation#getExpr4()
   * @see #getCollectOrIterateOperation()
   * @generated
   */
  EAttribute getCollectOrIterateOperation_Expr4();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperation <em>For All Or Exists Or One Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All Or Exists Or One Operation</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperation
   * @generated
   */
  EClass getForAllOrExistsOrOneOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getOp()
   * @see #getForAllOrExistsOrOneOperation()
   * @generated
   */
  EAttribute getForAllOrExistsOrOneOperation_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr1</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr1()
   * @see #getForAllOrExistsOrOneOperation()
   * @generated
   */
  EAttribute getForAllOrExistsOrOneOperation_Expr1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr2</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr2()
   * @see #getForAllOrExistsOrOneOperation()
   * @generated
   */
  EAttribute getForAllOrExistsOrOneOperation_Expr2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr3 <em>Expr3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr3</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr3()
   * @see #getForAllOrExistsOrOneOperation()
   * @generated
   */
  EAttribute getForAllOrExistsOrOneOperation_Expr3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr4 <em>Expr4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr4</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperation#getExpr4()
   * @see #getForAllOrExistsOrOneOperation()
   * @generated
   */
  EAttribute getForAllOrExistsOrOneOperation_Expr4();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.IsUniqueOperation <em>Is Unique Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Unique Operation</em>'.
   * @see org.xtext.alf.alf.IsUniqueOperation
   * @generated
   */
  EClass getIsUniqueOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.IsUniqueOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alf.alf.IsUniqueOperation#getName()
   * @see #getIsUniqueOperation()
   * @generated
   */
  EAttribute getIsUniqueOperation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.IsUniqueOperation#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.alf.alf.IsUniqueOperation#getExpr()
   * @see #getIsUniqueOperation()
   * @generated
   */
  EReference getIsUniqueOperation_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ValueSpecification <em>Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Specification</em>'.
   * @see org.xtext.alf.alf.ValueSpecification
   * @generated
   */
  EClass getValueSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NonLiteralValueSpecification <em>Non Literal Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Literal Value Specification</em>'.
   * @see org.xtext.alf.alf.NonLiteralValueSpecification
   * @generated
   */
  EClass getNonLiteralValueSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expression</em>'.
   * @see org.xtext.alf.alf.ParenthesizedExpression
   * @generated
   */
  EClass getParenthesizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ParenthesizedExpression#getExpOrTypeCast <em>Exp Or Type Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Or Type Cast</em>'.
   * @see org.xtext.alf.alf.ParenthesizedExpression#getExpOrTypeCast()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_ExpOrTypeCast();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ParenthesizedExpression#getCasted <em>Casted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Casted</em>'.
   * @see org.xtext.alf.alf.ParenthesizedExpression#getCasted()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_Casted();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ParenthesizedExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.ParenthesizedExpression#getSuffix()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NullExpression <em>Null Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Expression</em>'.
   * @see org.xtext.alf.alf.NullExpression
   * @generated
   */
  EClass getNullExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ThisExpression <em>This Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Expression</em>'.
   * @see org.xtext.alf.alf.ThisExpression
   * @generated
   */
  EClass getThisExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ThisExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.ThisExpression#getSuffix()
   * @see #getThisExpression()
   * @generated
   */
  EReference getThisExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Invocation Expression</em>'.
   * @see org.xtext.alf.alf.SuperInvocationExpression
   * @generated
   */
  EClass getSuperInvocationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SuperInvocationExpression#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.alf.alf.SuperInvocationExpression#getClassName()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EAttribute getSuperInvocationExpression_ClassName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SuperInvocationExpression#getOperationCallWithoutDot <em>Operation Call Without Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call Without Dot</em>'.
   * @see org.xtext.alf.alf.SuperInvocationExpression#getOperationCallWithoutDot()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EReference getSuperInvocationExpression_OperationCallWithoutDot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SuperInvocationExpression#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see org.xtext.alf.alf.SuperInvocationExpression#getOperationCall()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EReference getSuperInvocationExpression_OperationCall();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Creation Expression</em>'.
   * @see org.xtext.alf.alf.InstanceCreationExpression
   * @generated
   */
  EClass getInstanceCreationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InstanceCreationExpression#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constructor</em>'.
   * @see org.xtext.alf.alf.InstanceCreationExpression#getConstructor()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_Constructor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InstanceCreationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.xtext.alf.alf.InstanceCreationExpression#getTuple()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InstanceCreationExpression#getSequenceConstuctionCompletion <em>Sequence Constuction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Constuction Completion</em>'.
   * @see org.xtext.alf.alf.InstanceCreationExpression#getSequenceConstuctionCompletion()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_SequenceConstuctionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InstanceCreationExpression#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see org.xtext.alf.alf.InstanceCreationExpression#getSuffix()
   * @see #getInstanceCreationExpression()
   * @generated
   */
  EReference getInstanceCreationExpression_Suffix();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceConstructionOrAccessCompletion <em>Sequence Construction Or Access Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Or Access Completion</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionOrAccessCompletion
   * @generated
   */
  EClass getSequenceConstructionOrAccessCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#isMultiplicityIndicator()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EAttribute getSequenceConstructionOrAccessCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#getAccessCompletion <em>Access Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Completion</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#getAccessCompletion()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EReference getSequenceConstructionOrAccessCompletion_AccessCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#getSequenceCompletion <em>Sequence Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Completion</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#getSequenceCompletion()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EReference getSequenceConstructionOrAccessCompletion_SequenceCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionOrAccessCompletion#getExpression()
   * @see #getSequenceConstructionOrAccessCompletion()
   * @generated
   */
  EReference getSequenceConstructionOrAccessCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AccessCompletion <em>Access Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Completion</em>'.
   * @see org.xtext.alf.alf.AccessCompletion
   * @generated
   */
  EClass getAccessCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AccessCompletion#getAccessIndex <em>Access Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Index</em>'.
   * @see org.xtext.alf.alf.AccessCompletion#getAccessIndex()
   * @see #getAccessCompletion()
   * @generated
   */
  EReference getAccessCompletion_AccessIndex();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.PartialSequenceConstructionCompletion <em>Partial Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial Sequence Construction Completion</em>'.
   * @see org.xtext.alf.alf.PartialSequenceConstructionCompletion
   * @generated
   */
  EClass getPartialSequenceConstructionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.PartialSequenceConstructionCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.PartialSequenceConstructionCompletion#getExpression()
   * @see #getPartialSequenceConstructionCompletion()
   * @generated
   */
  EReference getPartialSequenceConstructionCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Completion</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionCompletion
   * @generated
   */
  EClass getSequenceConstructionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.SequenceConstructionCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionCompletion#isMultiplicityIndicator()
   * @see #getSequenceConstructionCompletion()
   * @generated
   */
  EAttribute getSequenceConstructionCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceConstructionCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionCompletion#getExpression()
   * @see #getSequenceConstructionCompletion()
   * @generated
   */
  EReference getSequenceConstructionCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Expression</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionExpression
   * @generated
   */
  EClass getSequenceConstructionExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.SequenceConstructionExpression#getSequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence Element</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionExpression#getSequenceElement()
   * @see #getSequenceConstructionExpression()
   * @generated
   */
  EReference getSequenceConstructionExpression_SequenceElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range Upper</em>'.
   * @see org.xtext.alf.alf.SequenceConstructionExpression#getRangeUpper()
   * @see #getSequenceConstructionExpression()
   * @generated
   */
  EReference getSequenceConstructionExpression_RangeUpper();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Element</em>'.
   * @see org.xtext.alf.alf.SequenceElement
   * @generated
   */
  EClass getSequenceElement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ClassExtentExpression <em>Class Extent Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Extent Expression</em>'.
   * @see org.xtext.alf.alf.ClassExtentExpression
   * @generated
   */
  EClass getClassExtentExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.alf.alf.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.Block#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see org.xtext.alf.alf.Block#getSequence()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Sequence();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Sequence</em>'.
   * @see org.xtext.alf.alf.StatementSequence
   * @generated
   */
  EClass getStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.StatementSequence#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.alf.alf.StatementSequence#getStatements()
   * @see #getStatementSequence()
   * @generated
   */
  EReference getStatementSequence_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.InlineStatement <em>Inline Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Statement</em>'.
   * @see org.xtext.alf.alf.InlineStatement
   * @generated
   */
  EClass getInlineStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.InlineStatement#getLangageName <em>Langage Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Langage Name</em>'.
   * @see org.xtext.alf.alf.InlineStatement#getLangageName()
   * @see #getInlineStatement()
   * @generated
   */
  EAttribute getInlineStatement_LangageName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.InlineStatement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see org.xtext.alf.alf.InlineStatement#getBody()
   * @see #getInlineStatement()
   * @generated
   */
  EAttribute getInlineStatement_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AnnotatedStatement <em>Annotated Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Statement</em>'.
   * @see org.xtext.alf.alf.AnnotatedStatement
   * @generated
   */
  EClass getAnnotatedStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AnnotatedStatement#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see org.xtext.alf.alf.AnnotatedStatement#getAnnotation()
   * @see #getAnnotatedStatement()
   * @generated
   */
  EReference getAnnotatedStatement_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AnnotatedStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.AnnotatedStatement#getBlock()
   * @see #getAnnotatedStatement()
   * @generated
   */
  EReference getAnnotatedStatement_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.DocumentedStatement <em>Documented Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documented Statement</em>'.
   * @see org.xtext.alf.alf.DocumentedStatement
   * @generated
   */
  EClass getDocumentedStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.DocumentedStatement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.alf.alf.DocumentedStatement#getComment()
   * @see #getDocumentedStatement()
   * @generated
   */
  EAttribute getDocumentedStatement_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.DocumentedStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.alf.alf.DocumentedStatement#getStatement()
   * @see #getDocumentedStatement()
   * @generated
   */
  EReference getDocumentedStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.alf.alf.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.xtext.alf.alf.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.Annotation#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.xtext.alf.alf.Annotation#getKind()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Kind();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.alf.alf.Annotation#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see org.xtext.alf.alf.Annotation#getArgs()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.xtext.alf.alf.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.BlockStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.BlockStatement#getBlock()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.EmptyStatement <em>Empty Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Statement</em>'.
   * @see org.xtext.alf.alf.EmptyStatement
   * @generated
   */
  EClass getEmptyStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Name Declaration Statement</em>'.
   * @see org.xtext.alf.alf.LocalNameDeclarationStatement
   * @generated
   */
  EClass getLocalNameDeclarationStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.LocalNameDeclarationStatement#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see org.xtext.alf.alf.LocalNameDeclarationStatement#getVarName()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EAttribute getLocalNameDeclarationStatement_VarName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LocalNameDeclarationStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.alf.alf.LocalNameDeclarationStatement#getType()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.LocalNameDeclarationStatement#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.xtext.alf.alf.LocalNameDeclarationStatement#isMultiplicityIndicator()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EAttribute getLocalNameDeclarationStatement_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LocalNameDeclarationStatement#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.xtext.alf.alf.LocalNameDeclarationStatement#getInit()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_Init();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.xtext.alf.alf.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.IfStatement#getSequentialClausses <em>Sequential Clausses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequential Clausses</em>'.
   * @see org.xtext.alf.alf.IfStatement#getSequentialClausses()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_SequentialClausses();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.IfStatement#getFinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Final Clause</em>'.
   * @see org.xtext.alf.alf.IfStatement#getFinalClause()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_FinalClause();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SequentialClauses <em>Sequential Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequential Clauses</em>'.
   * @see org.xtext.alf.alf.SequentialClauses
   * @generated
   */
  EClass getSequentialClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.SequentialClauses#getConccurentClauses <em>Conccurent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conccurent Clauses</em>'.
   * @see org.xtext.alf.alf.SequentialClauses#getConccurentClauses()
   * @see #getSequentialClauses()
   * @generated
   */
  EReference getSequentialClauses_ConccurentClauses();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ConcurrentClauses <em>Concurrent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concurrent Clauses</em>'.
   * @see org.xtext.alf.alf.ConcurrentClauses
   * @generated
   */
  EClass getConcurrentClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.ConcurrentClauses#getNonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Non Final Clause</em>'.
   * @see org.xtext.alf.alf.ConcurrentClauses#getNonFinalClause()
   * @see #getConcurrentClauses()
   * @generated
   */
  EReference getConcurrentClauses_NonFinalClause();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Final Clause</em>'.
   * @see org.xtext.alf.alf.NonFinalClause
   * @generated
   */
  EClass getNonFinalClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NonFinalClause#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.alf.alf.NonFinalClause#getCondition()
   * @see #getNonFinalClause()
   * @generated
   */
  EReference getNonFinalClause_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.NonFinalClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.NonFinalClause#getBlock()
   * @see #getNonFinalClause()
   * @generated
   */
  EReference getNonFinalClause_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.FinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final Clause</em>'.
   * @see org.xtext.alf.alf.FinalClause
   * @generated
   */
  EClass getFinalClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.FinalClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.FinalClause#getBlock()
   * @see #getFinalClause()
   * @generated
   */
  EReference getFinalClause_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.xtext.alf.alf.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SwitchStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.SwitchStatement#getExpression()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.SwitchStatement#getSwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Clause</em>'.
   * @see org.xtext.alf.alf.SwitchStatement#getSwitchClause()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_SwitchClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SwitchStatement#getDefaultClause <em>Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Clause</em>'.
   * @see org.xtext.alf.alf.SwitchStatement#getDefaultClause()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_DefaultClause();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Clause</em>'.
   * @see org.xtext.alf.alf.SwitchClause
   * @generated
   */
  EClass getSwitchClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.SwitchClause#getSwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Case</em>'.
   * @see org.xtext.alf.alf.SwitchClause#getSwitchCase()
   * @see #getSwitchClause()
   * @generated
   */
  EReference getSwitchClause_SwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SwitchClause#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.xtext.alf.alf.SwitchClause#getStatementSequence()
   * @see #getSwitchClause()
   * @generated
   */
  EReference getSwitchClause_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see org.xtext.alf.alf.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SwitchCase#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.SwitchCase#getExpression()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SwitchDefaultClause <em>Switch Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Default Clause</em>'.
   * @see org.xtext.alf.alf.SwitchDefaultClause
   * @generated
   */
  EClass getSwitchDefaultClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SwitchDefaultClause#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.xtext.alf.alf.SwitchDefaultClause#getStatementSequence()
   * @see #getSwitchDefaultClause()
   * @generated
   */
  EReference getSwitchDefaultClause_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Empty Statement Sequence</em>'.
   * @see org.xtext.alf.alf.NonEmptyStatementSequence
   * @generated
   */
  EClass getNonEmptyStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.NonEmptyStatementSequence#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.xtext.alf.alf.NonEmptyStatementSequence#getStatement()
   * @see #getNonEmptyStatementSequence()
   * @generated
   */
  EReference getNonEmptyStatementSequence_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.xtext.alf.alf.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.WhileStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.alf.alf.WhileStatement#getCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.WhileStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.WhileStatement#getBlock()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.xtext.alf.alf.DoStatement
   * @generated
   */
  EClass getDoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.DoStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.DoStatement#getBlock()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.DoStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.alf.alf.DoStatement#getCondition()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.xtext.alf.alf.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ForStatement#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control</em>'.
   * @see org.xtext.alf.alf.ForStatement#getControl()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Control();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ForStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.ForStatement#getBlock()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Control</em>'.
   * @see org.xtext.alf.alf.ForControl
   * @generated
   */
  EClass getForControl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop Variable Definition</em>'.
   * @see org.xtext.alf.alf.ForControl#getLoopVariableDefinition()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_LoopVariableDefinition();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Variable Definition</em>'.
   * @see org.xtext.alf.alf.LoopVariableDefinition
   * @generated
   */
  EClass getLoopVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.LoopVariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alf.alf.LoopVariableDefinition#getName()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EAttribute getLoopVariableDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LoopVariableDefinition#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.alf.alf.LoopVariableDefinition#getExpression1()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.LoopVariableDefinition#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.alf.alf.LoopVariableDefinition#getExpression2()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression2();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see org.xtext.alf.alf.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.xtext.alf.alf.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Statement</em>'.
   * @see org.xtext.alf.alf.AcceptStatement
   * @generated
   */
  EClass getAcceptStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AcceptStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.xtext.alf.alf.AcceptStatement#getClause()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_Clause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AcceptStatement#getSimpleAccept <em>Simple Accept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Accept</em>'.
   * @see org.xtext.alf.alf.AcceptStatement#getSimpleAccept()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_SimpleAccept();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AcceptStatement#getCompoundAccept <em>Compound Accept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compound Accept</em>'.
   * @see org.xtext.alf.alf.AcceptStatement#getCompoundAccept()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_CompoundAccept();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Accept Statement Completion</em>'.
   * @see org.xtext.alf.alf.SimpleAcceptStatementCompletion
   * @generated
   */
  EClass getSimpleAcceptStatementCompletion();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Accept Statement Completion</em>'.
   * @see org.xtext.alf.alf.CompoundAcceptStatementCompletion
   * @generated
   */
  EClass getCompoundAcceptStatementCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.CompoundAcceptStatementCompletion#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.CompoundAcceptStatementCompletion#getBlock()
   * @see #getCompoundAcceptStatementCompletion()
   * @generated
   */
  EReference getCompoundAcceptStatementCompletion_Block();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.CompoundAcceptStatementCompletion#getAcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accept Block</em>'.
   * @see org.xtext.alf.alf.CompoundAcceptStatementCompletion#getAcceptBlock()
   * @see #getCompoundAcceptStatementCompletion()
   * @generated
   */
  EReference getCompoundAcceptStatementCompletion_AcceptBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Block</em>'.
   * @see org.xtext.alf.alf.AcceptBlock
   * @generated
   */
  EClass getAcceptBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AcceptBlock#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.xtext.alf.alf.AcceptBlock#getClause()
   * @see #getAcceptBlock()
   * @generated
   */
  EReference getAcceptBlock_Clause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AcceptBlock#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.alf.alf.AcceptBlock#getBlock()
   * @see #getAcceptBlock()
   * @generated
   */
  EReference getAcceptBlock_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AcceptClause <em>Accept Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Clause</em>'.
   * @see org.xtext.alf.alf.AcceptClause
   * @generated
   */
  EClass getAcceptClause();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.AcceptClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alf.alf.AcceptClause#getName()
   * @see #getAcceptClause()
   * @generated
   */
  EAttribute getAcceptClause_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AcceptClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.xtext.alf.alf.AcceptClause#getQualifiedNameList()
   * @see #getAcceptClause()
   * @generated
   */
  EReference getAcceptClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ClassifyStatement <em>Classify Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classify Statement</em>'.
   * @see org.xtext.alf.alf.ClassifyStatement
   * @generated
   */
  EClass getClassifyStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassifyStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.alf.alf.ClassifyStatement#getExpression()
   * @see #getClassifyStatement()
   * @generated
   */
  EReference getClassifyStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassifyStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.xtext.alf.alf.ClassifyStatement#getClause()
   * @see #getClassifyStatement()
   * @generated
   */
  EReference getClassifyStatement_Clause();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ClassificationClause <em>Classification Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Clause</em>'.
   * @see org.xtext.alf.alf.ClassificationClause
   * @generated
   */
  EClass getClassificationClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationClause#getClassifyFromClause <em>Classify From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classify From Clause</em>'.
   * @see org.xtext.alf.alf.ClassificationClause#getClassifyFromClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ClassifyFromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationClause#getClassifyToClause <em>Classify To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classify To Clause</em>'.
   * @see org.xtext.alf.alf.ClassificationClause#getClassifyToClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ClassifyToClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationClause#getReclassyAllClause <em>Reclassy All Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reclassy All Clause</em>'.
   * @see org.xtext.alf.alf.ClassificationClause#getReclassyAllClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ReclassyAllClause();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ClassificationFromClause <em>Classification From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification From Clause</em>'.
   * @see org.xtext.alf.alf.ClassificationFromClause
   * @generated
   */
  EClass getClassificationFromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationFromClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.xtext.alf.alf.ClassificationFromClause#getQualifiedNameList()
   * @see #getClassificationFromClause()
   * @generated
   */
  EReference getClassificationFromClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ClassificationToClause <em>Classification To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification To Clause</em>'.
   * @see org.xtext.alf.alf.ClassificationToClause
   * @generated
   */
  EClass getClassificationToClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ClassificationToClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.xtext.alf.alf.ClassificationToClause#getQualifiedNameList()
   * @see #getClassificationToClause()
   * @generated
   */
  EReference getClassificationToClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reclassify All Clause</em>'.
   * @see org.xtext.alf.alf.ReclassifyAllClause
   * @generated
   */
  EClass getReclassifyAllClause();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.QualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name List</em>'.
   * @see org.xtext.alf.alf.QualifiedNameList
   * @generated
   */
  EClass getQualifiedNameList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alf.alf.QualifiedNameList#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualified Name</em>'.
   * @see org.xtext.alf.alf.QualifiedNameList#getQualifiedName()
   * @see #getQualifiedNameList()
   * @generated
   */
  EReference getQualifiedNameList_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement <em>Invocation Or Assignement Or Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invocation Or Assignement Or Declaration Statement</em>'.
   * @see org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement
   * @generated
   */
  EClass getInvocationOrAssignementOrDeclarationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement#getTypePart_OR_assignedPart_OR_invocationPart <em>Type Part OR assigned Part OR invocation Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Part OR assigned Part OR invocation Part</em>'.
   * @see org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement#getTypePart_OR_assignedPart_OR_invocationPart()
   * @see #getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  EReference getInvocationOrAssignementOrDeclarationStatement_TypePart_OR_assignedPart_OR_invocationPart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement#getVariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration Completion</em>'.
   * @see org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement#getVariableDeclarationCompletion()
   * @see #getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  EReference getInvocationOrAssignementOrDeclarationStatement_VariableDeclarationCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement#getAssignmentCompletion <em>Assignment Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Completion</em>'.
   * @see org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement#getAssignmentCompletion()
   * @see #getInvocationOrAssignementOrDeclarationStatement()
   * @generated
   */
  EReference getInvocationOrAssignementOrDeclarationStatement_AssignmentCompletion();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.SuperInvocationStatement <em>Super Invocation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Invocation Statement</em>'.
   * @see org.xtext.alf.alf.SuperInvocationStatement
   * @generated
   */
  EClass getSuperInvocationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.SuperInvocationStatement#get_super <em>super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>super</em>'.
   * @see org.xtext.alf.alf.SuperInvocationStatement#get_super()
   * @see #getSuperInvocationStatement()
   * @generated
   */
  EReference getSuperInvocationStatement__super();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.ThisInvocationStatement <em>This Invocation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Invocation Statement</em>'.
   * @see org.xtext.alf.alf.ThisInvocationStatement
   * @generated
   */
  EClass getThisInvocationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ThisInvocationStatement#get_this <em>this</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>this</em>'.
   * @see org.xtext.alf.alf.ThisInvocationStatement#get_this()
   * @see #getThisInvocationStatement()
   * @generated
   */
  EReference getThisInvocationStatement__this();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.ThisInvocationStatement#getAssignmentCompletion <em>Assignment Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Completion</em>'.
   * @see org.xtext.alf.alf.ThisInvocationStatement#getAssignmentCompletion()
   * @see #getThisInvocationStatement()
   * @generated
   */
  EReference getThisInvocationStatement_AssignmentCompletion();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.InstanceCreationInvocationStatement <em>Instance Creation Invocation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Creation Invocation Statement</em>'.
   * @see org.xtext.alf.alf.InstanceCreationInvocationStatement
   * @generated
   */
  EClass getInstanceCreationInvocationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.InstanceCreationInvocationStatement#get_new <em>new</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>new</em>'.
   * @see org.xtext.alf.alf.InstanceCreationInvocationStatement#get_new()
   * @see #getInstanceCreationInvocationStatement()
   * @generated
   */
  EReference getInstanceCreationInvocationStatement__new();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.VariableDeclarationCompletion <em>Variable Declaration Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration Completion</em>'.
   * @see org.xtext.alf.alf.VariableDeclarationCompletion
   * @generated
   */
  EClass getVariableDeclarationCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.VariableDeclarationCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity Indicator</em>'.
   * @see org.xtext.alf.alf.VariableDeclarationCompletion#isMultiplicityIndicator()
   * @see #getVariableDeclarationCompletion()
   * @generated
   */
  EAttribute getVariableDeclarationCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.VariableDeclarationCompletion#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.xtext.alf.alf.VariableDeclarationCompletion#getVariableName()
   * @see #getVariableDeclarationCompletion()
   * @generated
   */
  EAttribute getVariableDeclarationCompletion_VariableName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.VariableDeclarationCompletion#getInitValue <em>Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Value</em>'.
   * @see org.xtext.alf.alf.VariableDeclarationCompletion#getInitValue()
   * @see #getVariableDeclarationCompletion()
   * @generated
   */
  EReference getVariableDeclarationCompletion_InitValue();

  /**
   * Returns the meta object for class '{@link org.xtext.alf.alf.AssignmentCompletion <em>Assignment Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Completion</em>'.
   * @see org.xtext.alf.alf.AssignmentCompletion
   * @generated
   */
  EClass getAssignmentCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alf.alf.AssignmentCompletion#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.alf.alf.AssignmentCompletion#getOp()
   * @see #getAssignmentCompletion()
   * @generated
   */
  EAttribute getAssignmentCompletion_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.alf.alf.AssignmentCompletion#getRightHandSide <em>Right Hand Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
   * @see org.xtext.alf.alf.AssignmentCompletion#getRightHandSide()
   * @see #getAssignmentCompletion()
   * @generated
   */
  EReference getAssignmentCompletion_RightHandSide();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.ParameterDirection <em>Parameter Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Direction</em>'.
   * @see org.xtext.alf.alf.ParameterDirection
   * @generated
   */
  EEnum getParameterDirection();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Value</em>'.
   * @see org.xtext.alf.alf.BooleanValue
   * @generated
   */
  EEnum getBooleanValue();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.LinkOperationKind <em>Link Operation Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Link Operation Kind</em>'.
   * @see org.xtext.alf.alf.LinkOperationKind
   * @generated
   */
  EEnum getLinkOperationKind();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.SelectOrRejectOperator <em>Select Or Reject Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Select Or Reject Operator</em>'.
   * @see org.xtext.alf.alf.SelectOrRejectOperator
   * @generated
   */
  EEnum getSelectOrRejectOperator();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Collect Or Iterate Operator</em>'.
   * @see org.xtext.alf.alf.CollectOrIterateOperator
   * @generated
   */
  EEnum getCollectOrIterateOperator();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>For All Or Exists Or One Operator</em>'.
   * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperator
   * @generated
   */
  EEnum getForAllOrExistsOrOneOperator();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.AnnotationKind <em>Annotation Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Annotation Kind</em>'.
   * @see org.xtext.alf.alf.AnnotationKind
   * @generated
   */
  EEnum getAnnotationKind();

  /**
   * Returns the meta object for enum '{@link org.xtext.alf.alf.AssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Assignment Operator</em>'.
   * @see org.xtext.alf.alf.AssignmentOperator
   * @generated
   */
  EEnum getAssignmentOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlfFactory getAlfFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.OperationsImpl <em>Operations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.OperationsImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperations()
     * @generated
     */
    EClass OPERATIONS = eINSTANCE.getOperations();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATIONS__IMPORTS = eINSTANCE.getOperations_Imports();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATIONS__OPERATIONS = eINSTANCE.getOperations_Operations();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.OperationDefinitionOrStubImpl <em>Operation Definition Or Stub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.OperationDefinitionOrStubImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationDefinitionOrStub()
     * @generated
     */
    EClass OPERATION_DEFINITION_OR_STUB = eINSTANCE.getOperationDefinitionOrStub();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DEFINITION_OR_STUB__DECLARATION = eINSTANCE.getOperationDefinitionOrStub_Declaration();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DEFINITION_OR_STUB__BODY = eINSTANCE.getOperationDefinitionOrStub_Body();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.OperationDeclarationImpl <em>Operation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.OperationDeclarationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationDeclaration()
     * @generated
     */
    EClass OPERATION_DECLARATION = eINSTANCE.getOperationDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_DECLARATION__NAME = eINSTANCE.getOperationDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DECLARATION__FORMAL_PARAMETERS = eINSTANCE.getOperationDeclaration_FormalParameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DECLARATION__RETURN_TYPE = eINSTANCE.getOperationDeclaration_ReturnType();

    /**
     * The meta object literal for the '<em><b>Redefinition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DECLARATION__REDEFINITION = eINSTANCE.getOperationDeclaration_Redefinition();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.FormalParametersImpl <em>Formal Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.FormalParametersImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFormalParameters()
     * @generated
     */
    EClass FORMAL_PARAMETERS = eINSTANCE.getFormalParameters();

    /**
     * The meta object literal for the '<em><b>Formal Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETERS__FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameters_FormalParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.FormalParameterListImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFormalParameterList()
     * @generated
     */
    EClass FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameterList();

    /**
     * The meta object literal for the '<em><b>Formal Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER_LIST__FORMAL_PARAMETER = eINSTANCE.getFormalParameterList_FormalParameter();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.FormalParameterImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFormalParameter()
     * @generated
     */
    EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAL_PARAMETER__DIRECTION = eINSTANCE.getFormalParameter_Direction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAL_PARAMETER__NAME = eINSTANCE.getFormalParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMETER__TYPE = eINSTANCE.getFormalParameter_Type();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.TypePartImpl <em>Type Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.TypePartImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTypePart()
     * @generated
     */
    EClass TYPE_PART = eINSTANCE.getTypePart();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PART__TYPE_NAME = eINSTANCE.getTypePart_TypeName();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PART__MULTIPLICITY = eINSTANCE.getTypePart_Multiplicity();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.MultiplicityImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY__RANGE = eINSTANCE.getMultiplicity_Range();

    /**
     * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__ORDERED = eINSTANCE.getMultiplicity_Ordered();

    /**
     * The meta object literal for the '<em><b>Non Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__NON_UNIQUE = eINSTANCE.getMultiplicity_NonUnique();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__SEQUENCE = eINSTANCE.getMultiplicity_Sequence();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.MultiplicityRangeImpl <em>Multiplicity Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.MultiplicityRangeImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getMultiplicityRange()
     * @generated
     */
    EClass MULTIPLICITY_RANGE = eINSTANCE.getMultiplicityRange();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_RANGE__LOWER = eINSTANCE.getMultiplicityRange_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICITY_RANGE__UPPER = eINSTANCE.getMultiplicityRange_Upper();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NUMBER_LITERAL_WITHOUT_SUFFIXImpl <em>NUMBER LITERAL WITHOUT SUFFIX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NUMBER_LITERAL_WITHOUT_SUFFIXImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNUMBER_LITERAL_WITHOUT_SUFFIX()
     * @generated
     */
    EClass NUMBER_LITERAL_WITHOUT_SUFFIX = eINSTANCE.getNUMBER_LITERAL_WITHOUT_SUFFIX();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL_WITHOUT_SUFFIX__VALUE = eINSTANCE.getNUMBER_LITERAL_WITHOUT_SUFFIX_Value();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.INTEGER_LITERAL_WITHOUT_SUFFIXImpl <em>INTEGER LITERAL WITHOUT SUFFIX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.INTEGER_LITERAL_WITHOUT_SUFFIXImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getINTEGER_LITERAL_WITHOUT_SUFFIX()
     * @generated
     */
    EClass INTEGER_LITERAL_WITHOUT_SUFFIX = eINSTANCE.getINTEGER_LITERAL_WITHOUT_SUFFIX();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.UNLIMITED_LITERAL_WITHOUT_SUFFIXImpl <em>UNLIMITED LITERAL WITHOUT SUFFIX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.UNLIMITED_LITERAL_WITHOUT_SUFFIXImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUNLIMITED_LITERAL_WITHOUT_SUFFIX()
     * @generated
     */
    EClass UNLIMITED_LITERAL_WITHOUT_SUFFIX = eINSTANCE.getUNLIMITED_LITERAL_WITHOUT_SUFFIX();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.TypeNameImpl <em>Type Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.TypeNameImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTypeName()
     * @generated
     */
    EClass TYPE_NAME = eINSTANCE.getTypeName();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_NAME__QUALIFIED_NAME = eINSTANCE.getTypeName_QualifiedName();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.RedefinitionClauseImpl <em>Redefinition Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.RedefinitionClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getRedefinitionClause()
     * @generated
     */
    EClass REDEFINITION_CLAUSE = eINSTANCE.getRedefinitionClause();

    /**
     * The meta object literal for the '<em><b>Redefined Operations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDEFINITION_CLAUSE__REDEFINED_OPERATIONS = eINSTANCE.getRedefinitionClause_RedefinedOperations();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.TestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.TestImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTest()
     * @generated
     */
    EClass TEST = eINSTANCE.getTest();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__EXPRESSION = eINSTANCE.getTest_Expression();

    /**
     * The meta object literal for the '<em><b>Assign Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__ASSIGN_EXPRESSION = eINSTANCE.getTest_AssignExpression();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__STATEMENTS = eINSTANCE.getTest_Statements();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__BLOCK = eINSTANCE.getTest_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.LITERALImpl <em>LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.LITERALImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLITERAL()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLITERAL();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__SUFFIX = eINSTANCE.getLITERAL_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.BOOLEAN_LITERALImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBOOLEAN_LITERAL()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBOOLEAN_LITERAL();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBOOLEAN_LITERAL_Value();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NUMBER_LITERALImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNUMBER_LITERAL()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNUMBER_LITERAL();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNUMBER_LITERAL_Value();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.INTEGER_LITERALImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getINTEGER_LITERAL()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getINTEGER_LITERAL();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.UNLIMITED_LITERALImpl <em>UNLIMITED LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.UNLIMITED_LITERALImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUNLIMITED_LITERAL()
     * @generated
     */
    EClass UNLIMITED_LITERAL = eINSTANCE.getUNLIMITED_LITERAL();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.STRING_LITERALImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSTRING_LITERAL()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getSTRING_LITERAL();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getSTRING_LITERAL_Value();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NameExpressionImpl <em>Name Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NameExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNameExpression()
     * @generated
     */
    EClass NAME_EXPRESSION = eINSTANCE.getNameExpression();

    /**
     * The meta object literal for the '<em><b>Prefix Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_EXPRESSION__PREFIX_OP = eINSTANCE.getNameExpression_PrefixOp();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_EXPRESSION__PATH = eINSTANCE.getNameExpression_Path();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_EXPRESSION__ID = eINSTANCE.getNameExpression_Id();

    /**
     * The meta object literal for the '<em><b>Invocation Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_EXPRESSION__INVOCATION_COMPLETION = eINSTANCE.getNameExpression_InvocationCompletion();

    /**
     * The meta object literal for the '<em><b>Sequence Construction Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_EXPRESSION__SEQUENCE_CONSTRUCTION_COMPLETION = eINSTANCE.getNameExpression_SequenceConstructionCompletion();

    /**
     * The meta object literal for the '<em><b>Postfix Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_EXPRESSION__POSTFIX_OP = eINSTANCE.getNameExpression_PostfixOp();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_EXPRESSION__SUFFIX = eINSTANCE.getNameExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.QualifiedNamePathImpl <em>Qualified Name Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.QualifiedNamePathImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getQualifiedNamePath()
     * @generated
     */
    EClass QUALIFIED_NAME_PATH = eINSTANCE.getQualifiedNamePath();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME_PATH__NAMESPACE = eINSTANCE.getQualifiedNamePath_Namespace();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.UnqualifiedNameImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUnqualifiedName()
     * @generated
     */
    EClass UNQUALIFIED_NAME = eINSTANCE.getUnqualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNQUALIFIED_NAME__NAME = eINSTANCE.getUnqualifiedName_Name();

    /**
     * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNQUALIFIED_NAME__TEMPLATE_BINDING = eINSTANCE.getUnqualifiedName_TemplateBinding();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.TemplateBindingImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTemplateBinding()
     * @generated
     */
    EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__BINDINGS = eINSTANCE.getTemplateBinding_Bindings();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NamedTemplateBindingImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNamedTemplateBinding()
     * @generated
     */
    EClass NAMED_TEMPLATE_BINDING = eINSTANCE.getNamedTemplateBinding();

    /**
     * The meta object literal for the '<em><b>Formal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_TEMPLATE_BINDING__FORMAL = eINSTANCE.getNamedTemplateBinding_Formal();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_TEMPLATE_BINDING__ACTUAL = eINSTANCE.getNamedTemplateBinding_Actual();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.QualifiedNameWithBindingImpl <em>Qualified Name With Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.QualifiedNameWithBindingImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getQualifiedNameWithBinding()
     * @generated
     */
    EClass QUALIFIED_NAME_WITH_BINDING = eINSTANCE.getQualifiedNameWithBinding();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME_WITH_BINDING__ID = eINSTANCE.getQualifiedNameWithBinding_Id();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME_WITH_BINDING__BINDING = eINSTANCE.getQualifiedNameWithBinding_Binding();

    /**
     * The meta object literal for the '<em><b>Remaining</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME_WITH_BINDING__REMAINING = eINSTANCE.getQualifiedNameWithBinding_Remaining();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.TupleImpl <em>Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.TupleImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTuple()
     * @generated
     */
    EClass TUPLE = eINSTANCE.getTuple();

    /**
     * The meta object literal for the '<em><b>Tuple Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE__TUPLE_ELEMENTS = eINSTANCE.getTuple_TupleElements();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.TupleElementImpl <em>Tuple Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.TupleElementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getTupleElement()
     * @generated
     */
    EClass TUPLE_ELEMENT = eINSTANCE.getTupleElement();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_ELEMENT__ARGUMENT = eINSTANCE.getTupleElement_Argument();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ConditionalTestExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConditionalTestExpression()
     * @generated
     */
    EClass CONDITIONAL_TEST_EXPRESSION = eINSTANCE.getConditionalTestExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_TEST_EXPRESSION__EXP = eINSTANCE.getConditionalTestExpression_Exp();

    /**
     * The meta object literal for the '<em><b>When True</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_TEST_EXPRESSION__WHEN_TRUE = eINSTANCE.getConditionalTestExpression_WhenTrue();

    /**
     * The meta object literal for the '<em><b>When False</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_TEST_EXPRESSION__WHEN_FALSE = eINSTANCE.getConditionalTestExpression_WhenFalse();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ConditionalOrExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConditionalOrExpression()
     * @generated
     */
    EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_OR_EXPRESSION__EXP = eINSTANCE.getConditionalOrExpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ConditionalAndExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConditionalAndExpression()
     * @generated
     */
    EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_AND_EXPRESSION__EXP = eINSTANCE.getConditionalAndExpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.InclusiveOrExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInclusiveOrExpression()
     * @generated
     */
    EClass INCLUSIVE_OR_EXPRESSION = eINSTANCE.getInclusiveOrExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUSIVE_OR_EXPRESSION__EXP = eINSTANCE.getInclusiveOrExpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ExclusiveOrExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getExclusiveOrExpression()
     * @generated
     */
    EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSIVE_OR_EXPRESSION__EXP = eINSTANCE.getExclusiveOrExpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AndExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__EXP = eINSTANCE.getAndExpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.EqualityExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__EXP = eINSTANCE.getEqualityExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ClassificationExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationExpression()
     * @generated
     */
    EClass CLASSIFICATION_EXPRESSION = eINSTANCE.getClassificationExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_EXPRESSION__EXP = eINSTANCE.getClassificationExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFICATION_EXPRESSION__OP = eINSTANCE.getClassificationExpression_Op();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_EXPRESSION__TYPE_NAME = eINSTANCE.getClassificationExpression_TypeName();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.RelationalExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getRelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__LEFT = eINSTANCE.getRelationalExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_EXPRESSION__OP = eINSTANCE.getRelationalExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__RIGHT = eINSTANCE.getRelationalExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ShiftExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getShiftExpression()
     * @generated
     */
    EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__EXP = eINSTANCE.getShiftExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_EXPRESSION__OP = eINSTANCE.getShiftExpression_Op();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AdditiveExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__EXP = eINSTANCE.getAdditiveExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPRESSION__OP = eINSTANCE.getAdditiveExpression_Op();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.MultiplicativeExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__EXP = eINSTANCE.getMultiplicativeExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPRESSION__OP = eINSTANCE.getMultiplicativeExpression_Op();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.UnaryExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXP = eINSTANCE.getUnaryExpression_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.PrimaryExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__PREFIX = eINSTANCE.getPrimaryExpression_Prefix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SuffixExpressionImpl <em>Suffix Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SuffixExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSuffixExpression()
     * @generated
     */
    EClass SUFFIX_EXPRESSION = eINSTANCE.getSuffixExpression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.OperationCallExpressionImpl <em>Operation Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.OperationCallExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationCallExpression()
     * @generated
     */
    EClass OPERATION_CALL_EXPRESSION = eINSTANCE.getOperationCallExpression();

    /**
     * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_CALL_EXPRESSION__OPERATION_NAME = eINSTANCE.getOperationCallExpression_OperationName();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_CALL_EXPRESSION__TUPLE = eINSTANCE.getOperationCallExpression_Tuple();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_CALL_EXPRESSION__SUFFIX = eINSTANCE.getOperationCallExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.OperationCallExpressionWithoutDotImpl <em>Operation Call Expression Without Dot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.OperationCallExpressionWithoutDotImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getOperationCallExpressionWithoutDot()
     * @generated
     */
    EClass OPERATION_CALL_EXPRESSION_WITHOUT_DOT = eINSTANCE.getOperationCallExpressionWithoutDot();

    /**
     * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_CALL_EXPRESSION_WITHOUT_DOT__OPERATION_NAME = eINSTANCE.getOperationCallExpressionWithoutDot_OperationName();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_CALL_EXPRESSION_WITHOUT_DOT__TUPLE = eINSTANCE.getOperationCallExpressionWithoutDot_Tuple();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_CALL_EXPRESSION_WITHOUT_DOT__SUFFIX = eINSTANCE.getOperationCallExpressionWithoutDot_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.PropertyCallExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getPropertyCallExpression()
     * @generated
     */
    EClass PROPERTY_CALL_EXPRESSION = eINSTANCE.getPropertyCallExpression();

    /**
     * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CALL_EXPRESSION__PROPERTY_NAME = eINSTANCE.getPropertyCallExpression_PropertyName();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CALL_EXPRESSION__INDEX = eINSTANCE.getPropertyCallExpression_Index();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CALL_EXPRESSION__SUFFIX = eINSTANCE.getPropertyCallExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.LinkOperationExpressionImpl <em>Link Operation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.LinkOperationExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationExpression()
     * @generated
     */
    EClass LINK_OPERATION_EXPRESSION = eINSTANCE.getLinkOperationExpression();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_OPERATION_EXPRESSION__KIND = eINSTANCE.getLinkOperationExpression_Kind();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_OPERATION_EXPRESSION__TUPLE = eINSTANCE.getLinkOperationExpression_Tuple();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.LinkOperationTupleImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationTuple()
     * @generated
     */
    EClass LINK_OPERATION_TUPLE = eINSTANCE.getLinkOperationTuple();

    /**
     * The meta object literal for the '<em><b>Link Operation Tuple Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_OPERATION_TUPLE__LINK_OPERATION_TUPLE_ELEMENT = eINSTANCE.getLinkOperationTuple_LinkOperationTupleElement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.LinkOperationTupleElementImpl <em>Link Operation Tuple Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.LinkOperationTupleElementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationTupleElement()
     * @generated
     */
    EClass LINK_OPERATION_TUPLE_ELEMENT = eINSTANCE.getLinkOperationTupleElement();

    /**
     * The meta object literal for the '<em><b>Object Or Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE = eINSTANCE.getLinkOperationTupleElement_ObjectOrRole();

    /**
     * The meta object literal for the '<em><b>Role Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX = eINSTANCE.getLinkOperationTupleElement_RoleIndex();

    /**
     * The meta object literal for the '<em><b>Object Value Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC = eINSTANCE.getLinkOperationTupleElement_ObjectValueSpec();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceOperationExpressionImpl <em>Sequence Operation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceOperationExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceOperationExpression()
     * @generated
     */
    EClass SEQUENCE_OPERATION_EXPRESSION = eINSTANCE.getSequenceOperationExpression();

    /**
     * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_OPERATION_EXPRESSION__OPERATION_NAME = eINSTANCE.getSequenceOperationExpression_OperationName();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_OPERATION_EXPRESSION__TUPLE = eINSTANCE.getSequenceOperationExpression_Tuple();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_OPERATION_EXPRESSION__SUFFIX = eINSTANCE.getSequenceOperationExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceReductionExpressionImpl <em>Sequence Reduction Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceReductionExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceReductionExpression()
     * @generated
     */
    EClass SEQUENCE_REDUCTION_EXPRESSION = eINSTANCE.getSequenceReductionExpression();

    /**
     * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_REDUCTION_EXPRESSION__IS_ORDERED = eINSTANCE.getSequenceReductionExpression_IsOrdered();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_REDUCTION_EXPRESSION__BEHAVIOR = eINSTANCE.getSequenceReductionExpression_Behavior();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_REDUCTION_EXPRESSION__SUFFIX = eINSTANCE.getSequenceReductionExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceExpansionExpressionImpl <em>Sequence Expansion Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceExpansionExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceExpansionExpression()
     * @generated
     */
    EClass SEQUENCE_EXPANSION_EXPRESSION = eINSTANCE.getSequenceExpansionExpression();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_EXPANSION_EXPRESSION__SUFFIX = eINSTANCE.getSequenceExpansionExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl <em>Select Or Reject Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SelectOrRejectOperationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSelectOrRejectOperation()
     * @generated
     */
    EClass SELECT_OR_REJECT_OPERATION = eINSTANCE.getSelectOrRejectOperation();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OR_REJECT_OPERATION__OP = eINSTANCE.getSelectOrRejectOperation_Op();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OR_REJECT_OPERATION__EXPR1 = eINSTANCE.getSelectOrRejectOperation_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OR_REJECT_OPERATION__EXPR2 = eINSTANCE.getSelectOrRejectOperation_Expr2();

    /**
     * The meta object literal for the '<em><b>Expr3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OR_REJECT_OPERATION__EXPR3 = eINSTANCE.getSelectOrRejectOperation_Expr3();

    /**
     * The meta object literal for the '<em><b>Expr4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OR_REJECT_OPERATION__EXPR4 = eINSTANCE.getSelectOrRejectOperation_Expr4();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.CollectOrIterateOperationImpl <em>Collect Or Iterate Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.CollectOrIterateOperationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getCollectOrIterateOperation()
     * @generated
     */
    EClass COLLECT_OR_ITERATE_OPERATION = eINSTANCE.getCollectOrIterateOperation();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECT_OR_ITERATE_OPERATION__OP = eINSTANCE.getCollectOrIterateOperation_Op();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECT_OR_ITERATE_OPERATION__EXPR1 = eINSTANCE.getCollectOrIterateOperation_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECT_OR_ITERATE_OPERATION__EXPR2 = eINSTANCE.getCollectOrIterateOperation_Expr2();

    /**
     * The meta object literal for the '<em><b>Expr3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECT_OR_ITERATE_OPERATION__EXPR3 = eINSTANCE.getCollectOrIterateOperation_Expr3();

    /**
     * The meta object literal for the '<em><b>Expr4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECT_OR_ITERATE_OPERATION__EXPR4 = eINSTANCE.getCollectOrIterateOperation_Expr4();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ForAllOrExistsOrOneOperationImpl <em>For All Or Exists Or One Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ForAllOrExistsOrOneOperationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperation()
     * @generated
     */
    EClass FOR_ALL_OR_EXISTS_OR_ONE_OPERATION = eINSTANCE.getForAllOrExistsOrOneOperation();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__OP = eINSTANCE.getForAllOrExistsOrOneOperation_Op();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR1 = eINSTANCE.getForAllOrExistsOrOneOperation_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR2 = eINSTANCE.getForAllOrExistsOrOneOperation_Expr2();

    /**
     * The meta object literal for the '<em><b>Expr3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR3 = eINSTANCE.getForAllOrExistsOrOneOperation_Expr3();

    /**
     * The meta object literal for the '<em><b>Expr4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_OR_EXISTS_OR_ONE_OPERATION__EXPR4 = eINSTANCE.getForAllOrExistsOrOneOperation_Expr4();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.IsUniqueOperationImpl <em>Is Unique Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.IsUniqueOperationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getIsUniqueOperation()
     * @generated
     */
    EClass IS_UNIQUE_OPERATION = eINSTANCE.getIsUniqueOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_UNIQUE_OPERATION__NAME = eINSTANCE.getIsUniqueOperation_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_UNIQUE_OPERATION__EXPR = eINSTANCE.getIsUniqueOperation_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ValueSpecificationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getValueSpecification()
     * @generated
     */
    EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NonLiteralValueSpecificationImpl <em>Non Literal Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NonLiteralValueSpecificationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNonLiteralValueSpecification()
     * @generated
     */
    EClass NON_LITERAL_VALUE_SPECIFICATION = eINSTANCE.getNonLiteralValueSpecification();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ParenthesizedExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getParenthesizedExpression()
     * @generated
     */
    EClass PARENTHESIZED_EXPRESSION = eINSTANCE.getParenthesizedExpression();

    /**
     * The meta object literal for the '<em><b>Exp Or Type Cast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPRESSION__EXP_OR_TYPE_CAST = eINSTANCE.getParenthesizedExpression_ExpOrTypeCast();

    /**
     * The meta object literal for the '<em><b>Casted</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPRESSION__CASTED = eINSTANCE.getParenthesizedExpression_Casted();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPRESSION__SUFFIX = eINSTANCE.getParenthesizedExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NullExpressionImpl <em>Null Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NullExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNullExpression()
     * @generated
     */
    EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ThisExpressionImpl <em>This Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ThisExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getThisExpression()
     * @generated
     */
    EClass THIS_EXPRESSION = eINSTANCE.getThisExpression();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIS_EXPRESSION__SUFFIX = eINSTANCE.getThisExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SuperInvocationExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSuperInvocationExpression()
     * @generated
     */
    EClass SUPER_INVOCATION_EXPRESSION = eINSTANCE.getSuperInvocationExpression();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPER_INVOCATION_EXPRESSION__CLASS_NAME = eINSTANCE.getSuperInvocationExpression_ClassName();

    /**
     * The meta object literal for the '<em><b>Operation Call Without Dot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_INVOCATION_EXPRESSION__OPERATION_CALL_WITHOUT_DOT = eINSTANCE.getSuperInvocationExpression_OperationCallWithoutDot();

    /**
     * The meta object literal for the '<em><b>Operation Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_INVOCATION_EXPRESSION__OPERATION_CALL = eINSTANCE.getSuperInvocationExpression_OperationCall();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.InstanceCreationExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInstanceCreationExpression()
     * @generated
     */
    EClass INSTANCE_CREATION_EXPRESSION = eINSTANCE.getInstanceCreationExpression();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_CREATION_EXPRESSION__CONSTRUCTOR = eINSTANCE.getInstanceCreationExpression_Constructor();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_CREATION_EXPRESSION__TUPLE = eINSTANCE.getInstanceCreationExpression_Tuple();

    /**
     * The meta object literal for the '<em><b>Sequence Constuction Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_CREATION_EXPRESSION__SEQUENCE_CONSTUCTION_COMPLETION = eINSTANCE.getInstanceCreationExpression_SequenceConstuctionCompletion();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_CREATION_EXPRESSION__SUFFIX = eINSTANCE.getInstanceCreationExpression_Suffix();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceConstructionOrAccessCompletionImpl <em>Sequence Construction Or Access Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceConstructionOrAccessCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceConstructionOrAccessCompletion()
     * @generated
     */
    EClass SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION = eINSTANCE.getSequenceConstructionOrAccessCompletion();

    /**
     * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__MULTIPLICITY_INDICATOR = eINSTANCE.getSequenceConstructionOrAccessCompletion_MultiplicityIndicator();

    /**
     * The meta object literal for the '<em><b>Access Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__ACCESS_COMPLETION = eINSTANCE.getSequenceConstructionOrAccessCompletion_AccessCompletion();

    /**
     * The meta object literal for the '<em><b>Sequence Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__SEQUENCE_COMPLETION = eINSTANCE.getSequenceConstructionOrAccessCompletion_SequenceCompletion();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_CONSTRUCTION_OR_ACCESS_COMPLETION__EXPRESSION = eINSTANCE.getSequenceConstructionOrAccessCompletion_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AccessCompletionImpl <em>Access Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AccessCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAccessCompletion()
     * @generated
     */
    EClass ACCESS_COMPLETION = eINSTANCE.getAccessCompletion();

    /**
     * The meta object literal for the '<em><b>Access Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_COMPLETION__ACCESS_INDEX = eINSTANCE.getAccessCompletion_AccessIndex();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.PartialSequenceConstructionCompletionImpl <em>Partial Sequence Construction Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.PartialSequenceConstructionCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getPartialSequenceConstructionCompletion()
     * @generated
     */
    EClass PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION = eINSTANCE.getPartialSequenceConstructionCompletion();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL_SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = eINSTANCE.getPartialSequenceConstructionCompletion_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceConstructionCompletionImpl <em>Sequence Construction Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceConstructionCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceConstructionCompletion()
     * @generated
     */
    EClass SEQUENCE_CONSTRUCTION_COMPLETION = eINSTANCE.getSequenceConstructionCompletion();

    /**
     * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_CONSTRUCTION_COMPLETION__MULTIPLICITY_INDICATOR = eINSTANCE.getSequenceConstructionCompletion_MultiplicityIndicator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_CONSTRUCTION_COMPLETION__EXPRESSION = eINSTANCE.getSequenceConstructionCompletion_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceConstructionExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceConstructionExpression()
     * @generated
     */
    EClass SEQUENCE_CONSTRUCTION_EXPRESSION = eINSTANCE.getSequenceConstructionExpression();

    /**
     * The meta object literal for the '<em><b>Sequence Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_ELEMENT = eINSTANCE.getSequenceConstructionExpression_SequenceElement();

    /**
     * The meta object literal for the '<em><b>Range Upper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_CONSTRUCTION_EXPRESSION__RANGE_UPPER = eINSTANCE.getSequenceConstructionExpression_RangeUpper();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequenceElementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequenceElement()
     * @generated
     */
    EClass SEQUENCE_ELEMENT = eINSTANCE.getSequenceElement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ClassExtentExpressionImpl <em>Class Extent Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ClassExtentExpressionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassExtentExpression()
     * @generated
     */
    EClass CLASS_EXTENT_EXPRESSION = eINSTANCE.getClassExtentExpression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.BlockImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__SEQUENCE = eINSTANCE.getBlock_Sequence();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.StatementSequenceImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getStatementSequence()
     * @generated
     */
    EClass STATEMENT_SEQUENCE = eINSTANCE.getStatementSequence();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_SEQUENCE__STATEMENTS = eINSTANCE.getStatementSequence_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.InlineStatementImpl <em>Inline Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.InlineStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInlineStatement()
     * @generated
     */
    EClass INLINE_STATEMENT = eINSTANCE.getInlineStatement();

    /**
     * The meta object literal for the '<em><b>Langage Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_STATEMENT__LANGAGE_NAME = eINSTANCE.getInlineStatement_LangageName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_STATEMENT__BODY = eINSTANCE.getInlineStatement_Body();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AnnotatedStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAnnotatedStatement()
     * @generated
     */
    EClass ANNOTATED_STATEMENT = eINSTANCE.getAnnotatedStatement();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_STATEMENT__ANNOTATION = eINSTANCE.getAnnotatedStatement_Annotation();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_STATEMENT__BLOCK = eINSTANCE.getAnnotatedStatement_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.DocumentedStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getDocumentedStatement()
     * @generated
     */
    EClass DOCUMENTED_STATEMENT = eINSTANCE.getDocumentedStatement();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTED_STATEMENT__COMMENT = eINSTANCE.getDocumentedStatement_Comment();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_STATEMENT__STATEMENT = eINSTANCE.getDocumentedStatement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.StatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AnnotationImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__KIND = eINSTANCE.getAnnotation_Kind();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__ARGS = eINSTANCE.getAnnotation_Args();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.BlockStatementImpl <em>Block Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.BlockStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBlockStatement()
     * @generated
     */
    EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_STATEMENT__BLOCK = eINSTANCE.getBlockStatement_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.EmptyStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getEmptyStatement()
     * @generated
     */
    EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.LocalNameDeclarationStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLocalNameDeclarationStatement()
     * @generated
     */
    EClass LOCAL_NAME_DECLARATION_STATEMENT = eINSTANCE.getLocalNameDeclarationStatement();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_NAME_DECLARATION_STATEMENT__VAR_NAME = eINSTANCE.getLocalNameDeclarationStatement_VarName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_NAME_DECLARATION_STATEMENT__TYPE = eINSTANCE.getLocalNameDeclarationStatement_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR = eINSTANCE.getLocalNameDeclarationStatement_MultiplicityIndicator();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_NAME_DECLARATION_STATEMENT__INIT = eINSTANCE.getLocalNameDeclarationStatement_Init();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.IfStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Sequential Clausses</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__SEQUENTIAL_CLAUSSES = eINSTANCE.getIfStatement_SequentialClausses();

    /**
     * The meta object literal for the '<em><b>Final Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__FINAL_CLAUSE = eINSTANCE.getIfStatement_FinalClause();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SequentialClausesImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSequentialClauses()
     * @generated
     */
    EClass SEQUENTIAL_CLAUSES = eINSTANCE.getSequentialClauses();

    /**
     * The meta object literal for the '<em><b>Conccurent Clauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENTIAL_CLAUSES__CONCCURENT_CLAUSES = eINSTANCE.getSequentialClauses_ConccurentClauses();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ConcurrentClausesImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getConcurrentClauses()
     * @generated
     */
    EClass CONCURRENT_CLAUSES = eINSTANCE.getConcurrentClauses();

    /**
     * The meta object literal for the '<em><b>Non Final Clause</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCURRENT_CLAUSES__NON_FINAL_CLAUSE = eINSTANCE.getConcurrentClauses_NonFinalClause();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NonFinalClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNonFinalClause()
     * @generated
     */
    EClass NON_FINAL_CLAUSE = eINSTANCE.getNonFinalClause();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_FINAL_CLAUSE__CONDITION = eINSTANCE.getNonFinalClause_Condition();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_FINAL_CLAUSE__BLOCK = eINSTANCE.getNonFinalClause_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.FinalClauseImpl <em>Final Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.FinalClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getFinalClause()
     * @generated
     */
    EClass FINAL_CLAUSE = eINSTANCE.getFinalClause();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINAL_CLAUSE__BLOCK = eINSTANCE.getFinalClause_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SwitchStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitchStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Switch Clause</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__SWITCH_CLAUSE = eINSTANCE.getSwitchStatement_SwitchClause();

    /**
     * The meta object literal for the '<em><b>Default Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__DEFAULT_CLAUSE = eINSTANCE.getSwitchStatement_DefaultClause();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SwitchClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchClause()
     * @generated
     */
    EClass SWITCH_CLAUSE = eINSTANCE.getSwitchClause();

    /**
     * The meta object literal for the '<em><b>Switch Case</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CLAUSE__SWITCH_CASE = eINSTANCE.getSwitchClause_SwitchCase();

    /**
     * The meta object literal for the '<em><b>Statement Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CLAUSE__STATEMENT_SEQUENCE = eINSTANCE.getSwitchClause_StatementSequence();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SwitchCaseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchCase()
     * @generated
     */
    EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CASE__EXPRESSION = eINSTANCE.getSwitchCase_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SwitchDefaultClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSwitchDefaultClause()
     * @generated
     */
    EClass SWITCH_DEFAULT_CLAUSE = eINSTANCE.getSwitchDefaultClause();

    /**
     * The meta object literal for the '<em><b>Statement Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE = eINSTANCE.getSwitchDefaultClause_StatementSequence();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.NonEmptyStatementSequenceImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getNonEmptyStatementSequence()
     * @generated
     */
    EClass NON_EMPTY_STATEMENT_SEQUENCE = eINSTANCE.getNonEmptyStatementSequence();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_EMPTY_STATEMENT_SEQUENCE__STATEMENT = eINSTANCE.getNonEmptyStatementSequence_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.WhileStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__BLOCK = eINSTANCE.getWhileStatement_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.DoStatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.DoStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getDoStatement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDoStatement();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__BLOCK = eINSTANCE.getDoStatement_Block();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__CONDITION = eINSTANCE.getDoStatement_Condition();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ForStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__CONTROL = eINSTANCE.getForStatement_Control();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__BLOCK = eINSTANCE.getForStatement_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ForControlImpl <em>For Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ForControlImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForControl()
     * @generated
     */
    EClass FOR_CONTROL = eINSTANCE.getForControl();

    /**
     * The meta object literal for the '<em><b>Loop Variable Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__LOOP_VARIABLE_DEFINITION = eINSTANCE.getForControl_LoopVariableDefinition();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.LoopVariableDefinitionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLoopVariableDefinition()
     * @generated
     */
    EClass LOOP_VARIABLE_DEFINITION = eINSTANCE.getLoopVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP_VARIABLE_DEFINITION__NAME = eINSTANCE.getLoopVariableDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_VARIABLE_DEFINITION__EXPRESSION1 = eINSTANCE.getLoopVariableDefinition_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_VARIABLE_DEFINITION__EXPRESSION2 = eINSTANCE.getLoopVariableDefinition_Expression2();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.BreakStatementImpl <em>Break Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.BreakStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBreakStatement()
     * @generated
     */
    EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ReturnStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AcceptStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAcceptStatement()
     * @generated
     */
    EClass ACCEPT_STATEMENT = eINSTANCE.getAcceptStatement();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPT_STATEMENT__CLAUSE = eINSTANCE.getAcceptStatement_Clause();

    /**
     * The meta object literal for the '<em><b>Simple Accept</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPT_STATEMENT__SIMPLE_ACCEPT = eINSTANCE.getAcceptStatement_SimpleAccept();

    /**
     * The meta object literal for the '<em><b>Compound Accept</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPT_STATEMENT__COMPOUND_ACCEPT = eINSTANCE.getAcceptStatement_CompoundAccept();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SimpleAcceptStatementCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSimpleAcceptStatementCompletion()
     * @generated
     */
    EClass SIMPLE_ACCEPT_STATEMENT_COMPLETION = eINSTANCE.getSimpleAcceptStatementCompletion();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.CompoundAcceptStatementCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getCompoundAcceptStatementCompletion()
     * @generated
     */
    EClass COMPOUND_ACCEPT_STATEMENT_COMPLETION = eINSTANCE.getCompoundAcceptStatementCompletion();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK = eINSTANCE.getCompoundAcceptStatementCompletion_Block();

    /**
     * The meta object literal for the '<em><b>Accept Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK = eINSTANCE.getCompoundAcceptStatementCompletion_AcceptBlock();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AcceptBlockImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAcceptBlock()
     * @generated
     */
    EClass ACCEPT_BLOCK = eINSTANCE.getAcceptBlock();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPT_BLOCK__CLAUSE = eINSTANCE.getAcceptBlock_Clause();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPT_BLOCK__BLOCK = eINSTANCE.getAcceptBlock_Block();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AcceptClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAcceptClause()
     * @generated
     */
    EClass ACCEPT_CLAUSE = eINSTANCE.getAcceptClause();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCEPT_CLAUSE__NAME = eINSTANCE.getAcceptClause_Name();

    /**
     * The meta object literal for the '<em><b>Qualified Name List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPT_CLAUSE__QUALIFIED_NAME_LIST = eINSTANCE.getAcceptClause_QualifiedNameList();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ClassifyStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassifyStatement()
     * @generated
     */
    EClass CLASSIFY_STATEMENT = eINSTANCE.getClassifyStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFY_STATEMENT__EXPRESSION = eINSTANCE.getClassifyStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFY_STATEMENT__CLAUSE = eINSTANCE.getClassifyStatement_Clause();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ClassificationClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationClause()
     * @generated
     */
    EClass CLASSIFICATION_CLAUSE = eINSTANCE.getClassificationClause();

    /**
     * The meta object literal for the '<em><b>Classify From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_CLAUSE__CLASSIFY_FROM_CLAUSE = eINSTANCE.getClassificationClause_ClassifyFromClause();

    /**
     * The meta object literal for the '<em><b>Classify To Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_CLAUSE__CLASSIFY_TO_CLAUSE = eINSTANCE.getClassificationClause_ClassifyToClause();

    /**
     * The meta object literal for the '<em><b>Reclassy All Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_CLAUSE__RECLASSY_ALL_CLAUSE = eINSTANCE.getClassificationClause_ReclassyAllClause();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ClassificationFromClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationFromClause()
     * @generated
     */
    EClass CLASSIFICATION_FROM_CLAUSE = eINSTANCE.getClassificationFromClause();

    /**
     * The meta object literal for the '<em><b>Qualified Name List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST = eINSTANCE.getClassificationFromClause_QualifiedNameList();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ClassificationToClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getClassificationToClause()
     * @generated
     */
    EClass CLASSIFICATION_TO_CLAUSE = eINSTANCE.getClassificationToClause();

    /**
     * The meta object literal for the '<em><b>Qualified Name List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST = eINSTANCE.getClassificationToClause_QualifiedNameList();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ReclassifyAllClauseImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getReclassifyAllClause()
     * @generated
     */
    EClass RECLASSIFY_ALL_CLAUSE = eINSTANCE.getReclassifyAllClause();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.QualifiedNameListImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getQualifiedNameList()
     * @generated
     */
    EClass QUALIFIED_NAME_LIST = eINSTANCE.getQualifiedNameList();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_NAME_LIST__QUALIFIED_NAME = eINSTANCE.getQualifiedNameList_QualifiedName();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl <em>Invocation Or Assignement Or Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.InvocationOrAssignementOrDeclarationStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInvocationOrAssignementOrDeclarationStatement()
     * @generated
     */
    EClass INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement();

    /**
     * The meta object literal for the '<em><b>Type Part OR assigned Part OR invocation Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__TYPE_PART_OR_ASSIGNED_PART_OR_INVOCATION_PART = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement_TypePart_OR_assignedPart_OR_invocationPart();

    /**
     * The meta object literal for the '<em><b>Variable Declaration Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__VARIABLE_DECLARATION_COMPLETION = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement_VariableDeclarationCompletion();

    /**
     * The meta object literal for the '<em><b>Assignment Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION_OR_ASSIGNEMENT_OR_DECLARATION_STATEMENT__ASSIGNMENT_COMPLETION = eINSTANCE.getInvocationOrAssignementOrDeclarationStatement_AssignmentCompletion();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.SuperInvocationStatementImpl <em>Super Invocation Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.SuperInvocationStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSuperInvocationStatement()
     * @generated
     */
    EClass SUPER_INVOCATION_STATEMENT = eINSTANCE.getSuperInvocationStatement();

    /**
     * The meta object literal for the '<em><b>super</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_INVOCATION_STATEMENT__SUPER = eINSTANCE.getSuperInvocationStatement__super();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.ThisInvocationStatementImpl <em>This Invocation Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.ThisInvocationStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getThisInvocationStatement()
     * @generated
     */
    EClass THIS_INVOCATION_STATEMENT = eINSTANCE.getThisInvocationStatement();

    /**
     * The meta object literal for the '<em><b>this</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIS_INVOCATION_STATEMENT__THIS = eINSTANCE.getThisInvocationStatement__this();

    /**
     * The meta object literal for the '<em><b>Assignment Completion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIS_INVOCATION_STATEMENT__ASSIGNMENT_COMPLETION = eINSTANCE.getThisInvocationStatement_AssignmentCompletion();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.InstanceCreationInvocationStatementImpl <em>Instance Creation Invocation Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.InstanceCreationInvocationStatementImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getInstanceCreationInvocationStatement()
     * @generated
     */
    EClass INSTANCE_CREATION_INVOCATION_STATEMENT = eINSTANCE.getInstanceCreationInvocationStatement();

    /**
     * The meta object literal for the '<em><b>new</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_CREATION_INVOCATION_STATEMENT__NEW = eINSTANCE.getInstanceCreationInvocationStatement__new();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.VariableDeclarationCompletionImpl <em>Variable Declaration Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.VariableDeclarationCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getVariableDeclarationCompletion()
     * @generated
     */
    EClass VARIABLE_DECLARATION_COMPLETION = eINSTANCE.getVariableDeclarationCompletion();

    /**
     * The meta object literal for the '<em><b>Multiplicity Indicator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION_COMPLETION__MULTIPLICITY_INDICATOR = eINSTANCE.getVariableDeclarationCompletion_MultiplicityIndicator();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION_COMPLETION__VARIABLE_NAME = eINSTANCE.getVariableDeclarationCompletion_VariableName();

    /**
     * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION_COMPLETION__INIT_VALUE = eINSTANCE.getVariableDeclarationCompletion_InitValue();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.impl.AssignmentCompletionImpl <em>Assignment Completion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.impl.AssignmentCompletionImpl
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAssignmentCompletion()
     * @generated
     */
    EClass ASSIGNMENT_COMPLETION = eINSTANCE.getAssignmentCompletion();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_COMPLETION__OP = eINSTANCE.getAssignmentCompletion_Op();

    /**
     * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_COMPLETION__RIGHT_HAND_SIDE = eINSTANCE.getAssignmentCompletion_RightHandSide();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.ParameterDirection <em>Parameter Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.ParameterDirection
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getParameterDirection()
     * @generated
     */
    EEnum PARAMETER_DIRECTION = eINSTANCE.getParameterDirection();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.BooleanValue <em>Boolean Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.BooleanValue
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getBooleanValue()
     * @generated
     */
    EEnum BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.LinkOperationKind <em>Link Operation Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.LinkOperationKind
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getLinkOperationKind()
     * @generated
     */
    EEnum LINK_OPERATION_KIND = eINSTANCE.getLinkOperationKind();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.SelectOrRejectOperator <em>Select Or Reject Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.SelectOrRejectOperator
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getSelectOrRejectOperator()
     * @generated
     */
    EEnum SELECT_OR_REJECT_OPERATOR = eINSTANCE.getSelectOrRejectOperator();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.CollectOrIterateOperator <em>Collect Or Iterate Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.CollectOrIterateOperator
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getCollectOrIterateOperator()
     * @generated
     */
    EEnum COLLECT_OR_ITERATE_OPERATOR = eINSTANCE.getCollectOrIterateOperator();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.ForAllOrExistsOrOneOperator <em>For All Or Exists Or One Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.ForAllOrExistsOrOneOperator
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getForAllOrExistsOrOneOperator()
     * @generated
     */
    EEnum FOR_ALL_OR_EXISTS_OR_ONE_OPERATOR = eINSTANCE.getForAllOrExistsOrOneOperator();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.AnnotationKind <em>Annotation Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.AnnotationKind
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAnnotationKind()
     * @generated
     */
    EEnum ANNOTATION_KIND = eINSTANCE.getAnnotationKind();

    /**
     * The meta object literal for the '{@link org.xtext.alf.alf.AssignmentOperator <em>Assignment Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alf.alf.AssignmentOperator
     * @see org.xtext.alf.alf.impl.AlfPackageImpl#getAssignmentOperator()
     * @generated
     */
    EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

  }

} //AlfPackage
