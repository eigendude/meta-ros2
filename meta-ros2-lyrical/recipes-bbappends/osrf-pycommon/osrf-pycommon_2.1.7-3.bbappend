PROVIDES += "${PYTHON_PN}-${BPN}"

PACKAGES =+ "${PYTHON_PN}-${BPN}"

FILES:${PN} += "${datadir}/ament_index/resource_index/packages/osrf_pycommon"
FILES:${PYTHON_PN}-${BPN} = "${PYTHON_SITEPACKAGES_DIR}/*"

BBCLASSEXTEND = "native nativesdk"

# launch-ros depends on python3-osrf-pycommon at runtime, but this generated
# recipe emits osrf-pycommon. Provide the expected runtime package name.
RPROVIDES:${PN} += "python3-osrf-pycommon"
